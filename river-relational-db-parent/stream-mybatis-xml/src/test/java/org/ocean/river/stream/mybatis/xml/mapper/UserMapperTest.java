package org.ocean.river.stream.mybatis.xml.mapper;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ocean.river.stream.mybatis.xml.StreamMybatisXmlApplication;
import org.ocean.river.stream.mybatis.xml.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

/**
 * @author lqw29670
 * @version 1.0
 * @date 2020/9/16 11:42 上午
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StreamMybatisXmlApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        UserDO user = UserDO.builder().username("test").password("qwer").createTime(new Date()).build();
        userMapper.insert(user);
    }

    @Test
    public void testUpdateById() {
        UserDO updateUser = UserDO.builder().id(1).password("qwer").build();
        userMapper.updateById(updateUser);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(2);
    }

    @Test
    public void testQueryById() {
        UserDO userDO = userMapper.queryById(4);
        System.out.println(JSON.toJSON(userDO));
    }

    @Test
    public void testQueryByUsername() {
        UserDO test = userMapper.queryByUsername("test");
        System.out.println(JSON.toJSON(test));
    }

    @Test
    public void testQueryByIds() {
        List<UserDO> users = userMapper.queryByIds(Arrays.asList(1, 4));
        System.out.println("users：" + users.size());
    }

}
