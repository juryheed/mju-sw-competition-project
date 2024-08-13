package com.example.swcompetitionproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SwCompetitionProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwCompetitionProjectApplication.class, args);
    }

}
