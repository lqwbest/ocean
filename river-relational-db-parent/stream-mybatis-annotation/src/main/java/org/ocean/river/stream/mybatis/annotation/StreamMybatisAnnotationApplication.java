package org.ocean.river.stream.mybatis.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author flyfish
 */
@SpringBootApplication
@MapperScan(basePackages = { "org.ocean.river.stream.mybatis.annotation.mapper" })
public class StreamMybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamMybatisAnnotationApplication.class, args);
    }

}
