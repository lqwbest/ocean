package org.ocean.river.stream.mybatis.xml.mapper;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ocean.river.stream.mybatis.xml.dataobject.UserDO;
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
    int insert(UserDO user);

    /**
     * 更新
     * @param user the user
     * @return the update count
     */
    int updateById(UserDO user);

    /**
     * 删除
     * @param id the id
     * @return the delete count
     */
    int deleteById(@Param("id") Integer id);

    /**
     * 查询
     * @param id  the id
     * @return the user
     */
    UserDO queryById(Integer id);

    /**
     * 查询
     * @param username  the username
     * @return the user
     */
    UserDO queryByUsername(@Param("username") String username);

    /**
     * 查询
     * @param ids  the ids
     * @return the users
     */
    List<UserDO> queryByIds(@Param("ids") Collection<Integer> ids);
}
