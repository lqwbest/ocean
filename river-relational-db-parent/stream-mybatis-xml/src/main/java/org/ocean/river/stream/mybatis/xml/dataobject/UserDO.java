package org.ocean.river.stream.mybatis.xml.dataobject;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lqw29670
 * @version 1.0
 * @date 2020/9/16 11:34 上午
 **/
@Getter
@Setter
@ToString
@Builder
public class UserDO {
    /** 用户编号*/
    private Integer id;

    /** 账号*/
    private String  username;

    /** 密码（明文）*/
    private String  password;

    /** 创建时间*/
    private Date    createTime;

}
