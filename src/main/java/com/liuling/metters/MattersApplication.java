package com.liuling.matters;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuling.matters.dao")
public class MattersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MattersApplication.class, args);
    }

}
