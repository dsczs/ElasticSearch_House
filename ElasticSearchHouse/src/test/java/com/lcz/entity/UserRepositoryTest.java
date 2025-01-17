package com.lcz.entity;

import com.lcz.ApplicationTests;
import com.lcz.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        User user = userRepository.findOne(1L);
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());
    }
}
