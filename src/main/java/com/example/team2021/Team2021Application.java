package com.example.team2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Team2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Team2021Application.class, args);
    }
    /**
     * 注入 BCryptPasswordEncoder密码验证
     * @return
     */
    @Bean
    public BCryptPasswordEncoder createPasswordEncode() {
        return new BCryptPasswordEncoder();
    }

}
