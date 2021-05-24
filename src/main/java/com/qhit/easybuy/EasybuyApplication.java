package com.qhit.easybuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qhit.easybuy")
@MapperScan(basePackages = {"com.qhit.easybuy.dao"})
public class EasybuyApplication {

    public static void main(String[] args) {
     SpringApplication.run(EasybuyApplication.class, args);
    }
}
