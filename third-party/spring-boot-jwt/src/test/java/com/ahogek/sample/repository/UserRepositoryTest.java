package com.ahogek.sample.repository;

import com.ahogek.sample.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByEmailNotFound() {
        Optional<User> byEmail = userRepository.findByEmail("test@test.com");
        Assertions.assertFalse(byEmail.isPresent());
    }
}
