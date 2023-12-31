package com.example.bulkhead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BulkheadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BulkheadApplication.class, args);
    }

}
