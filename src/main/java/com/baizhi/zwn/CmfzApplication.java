package com.baizhi.zwn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.baizhi.zwn.mapper")
@SpringBootApplication
public class CmfzApplication  {

    public static void main(String[] args) {
        SpringApplication.run(CmfzApplication.class, args);
    }

}

