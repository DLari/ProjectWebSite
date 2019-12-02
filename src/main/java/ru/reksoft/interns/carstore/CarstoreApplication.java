package ru.reksoft.interns.carstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CarstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarstoreApplication.class, args);
    }



}