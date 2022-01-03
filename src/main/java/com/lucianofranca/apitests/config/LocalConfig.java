package com.lucianofranca.apitests.config;

import com.lucianofranca.apitests.domain.User;
import com.lucianofranca.apitests.rrepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Luciano de França", "luciano#gmail.com", "123");
        User u2 = new User(null, "Heloisa Cristina", "heloisa@gmail.com", "321");

        repository.saveAll(List.of(u1, u2));
    }
}
