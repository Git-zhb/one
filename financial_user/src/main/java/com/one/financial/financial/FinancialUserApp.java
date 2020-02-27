package com.one.financial.financial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Mr.zhao on 2020/2/26.
 */
@SpringBootApplication
@MapperScan("com.one.financial.financial.dao")
public class FinancialUserApp {
    public static void main(String[] args) {
        SpringApplication.run(FinancialUserApp.class, args);
    }
}
