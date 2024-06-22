package com.example.category;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class CategoryApplication {
    public CategoryApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class, args);
    }
}
