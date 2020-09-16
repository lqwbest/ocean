package org.ocean.river.stream.mybatis.xml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author flyfish
 */
@SpringBootApplication
@MapperScan(basePackages = "org.ocean.river.stream.mybatis.xml.mapper")
public class StreamMybatisXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamMybatisXmlApplication.class, args);
    }

}
