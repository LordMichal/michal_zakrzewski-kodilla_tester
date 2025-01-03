package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"user1", "User-1", "USER_3", "user", "Ussser.5","User-user"})
    public void validatorUserNameChecker(String username){
        assertTrue(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"us", "2", "", "  ", "user@admin", "User%$#@#$6"})
    public void validatorBedUserNameChcecer(String username){
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"validator@emali.com", "lastname123@gmail.com", "example@email.com"})
    public void validatorEmailChecker (String email){
        assertTrue(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"validatoremail.com", "lastname@gmail", "@email.com"})
    public void validatorBedEmailChecker (String email){
        assertFalse(validator.validateEmail(email));
    }
}