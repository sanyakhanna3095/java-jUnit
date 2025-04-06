package com.bridgelabz.advancedProblemsTest;

import com.bridgelabz.advancedProblems.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private UserRegistration user;

    @BeforeEach
    void setUp(){
        user=new UserRegistration();
    }


    @Test
    void shouldRegistrationBeValid() {
        Assertions.assertDoesNotThrow(() -> user.registerUser("sanya", "sanya@example.com", "Password123"));
    }

    @Test
    void shouldUsernameBeEmpty() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("", "sanya@example.com", "Password123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void shouldValidateEmail() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("sanya", "sanyagmail.com", "Password123"));
        Assertions.assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void shouldCheckIfPasswordIsShort() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("sanya", "sanya@example.com", "12345"));
        Assertions.assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}
