package com.right.vivo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DW
 */
@SpringBootApplication
@MapperScan("com.right.vivo.data")
public class VivoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VivoApplication.class, args);
    }

}
