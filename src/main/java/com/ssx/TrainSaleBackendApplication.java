package com.ssx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ssx.mapper")
@SpringBootApplication
public class TrainSaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainSaleBackendApplication.class, args);
    }

}
