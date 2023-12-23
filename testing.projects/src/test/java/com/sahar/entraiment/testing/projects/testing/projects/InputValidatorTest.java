package com.sahar.entraiment.testing.projects.testing.projects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InputValidatorTest {
    InputValidator validator1;

    @BeforeEach
    void init_objects() {
	validator1 = new InputValidator();

    }

    @Test
    void verify_phoneNumber_mustContainTenDigits() {
	// Arrange
	String isValidPhoneNumber = "93090615";

	// Act
	boolean verified = validator1.verifyLength_PhoneNumber(isValidPhoneNumber);

	// Assert
	assertEquals(true, verified);

    }

    @Test
    void verify_isDigit_phoneNumber() {

	// Arrange
	String isValidPhoneNumber = "93090615";

	// Act
	boolean verified = validator1.verify_isDigit_phoneNumber(isValidPhoneNumber);

	// Assert
	assertEquals(true, verified);

    }

}
