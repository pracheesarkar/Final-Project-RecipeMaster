package com.example.recipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RecipeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeAppApplication.class, args);
    }

}
