package org.ocean.river.stream.mybatis.annotation.mapper;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.ocean.river.stream.mybatis.annotation.dataobject.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author lqw29670
 * @version 1.0
 * @date 2020/9/16 11:38 上午
 **/
@Repository
public interface UserMapper {

    /**
     * 插入
     * @param user the user
     * @return id
     */
    @Insert("INSERT INTO users(username, password, create_time) VALUES(#{username}, #{password}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(UserDO user);

    /**
     * 更新
     * @param user the user
     * @return the update count
     */
    @Update(value = {
            "<script>",
            "UPDATE users",
            "<set>",
            "<if test='username != null'>, username = #{username}</if>",
            "<if test='password != null'>, password = #{password}</if>",
            "WHERE id = #{id}",
            "</set>",
            "</script>"
    })
    int updateById(UserDO user);

    /**
     * 删除
     * @param id the id
     * @return the delete count
     */
    @Insert("DELETE FROM users WHERE id = #{id}")
    int deleteById(@Param("id") Integer id);

    /**
     * 查询
     * @param id  the id
     * @return the user
     */
    @Select("SELECT id, username, password, create_time FROM users WHERE id = #{id}")
    UserDO queryById(Integer id);

    /**
     * 查询
     * @param username  the username
     * @return the user
     */
    @Select("SELECT id, username, password, create_time FROM users WHERE username = #{username}")
    UserDO queryByUsername(@Param("username") String username);

    /**
     * 查询
     * @param ids  the ids
     * @return the users
     */
    @Select(value = {
            "<script>",
            "SELECT id, username, password, create_time FROM users",
            "WHERE id IN",
            "<foreach item='id' collection='ids' separator=',' open='(' close=')' index=''>",
            "#{id}",
            "</foreach>",
            "</script>"
    })
    List<UserDO> queryByIds(@Param("ids") Collection<Integer> ids);
}
