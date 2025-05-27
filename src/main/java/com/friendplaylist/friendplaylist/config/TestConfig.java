package com.friendplaylist.friendplaylist.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.friendplaylist.friendplaylist.entities.User;
import com.friendplaylist.friendplaylist.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "JonasLimaDomingues@gmail.com", "Jonas", "123456");
        User u2 = new User(null, "MariaFernanda@gmail.com", "Mafe", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }



}
