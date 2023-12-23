package com.sahar.entraiment.testing.projects.mes.testesIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Calculator1Test {

    @Test
    void verifiyAdditionOfTwoPositiveNumbers() {

	// Arrange
	double number1 = 5;
	double number2 = 6;
	Calculator1 calcul = new Calculator1(number1, number2);

	// Act
	double res = calcul.addition();

	// Assert
	assertEquals(11, res);

    }

    @Test
    void verifiySoustractionOfTwoPositiveNumbers() {

	// Arrange
	double number1 = 7;
	double number2 = 6;
	Calculator1 calcul = new Calculator1(number1, number2);

	// Act
	double res = calcul.soustraction();

	// Assert
	assertEquals(1, res);

    }

    @Test
    void verifiyMltiplicationOfTwoPositiveNumbers() {

	// Arrange
	double number1 = 10;
	double number2 = 6;
	Calculator1 calcul = new Calculator1(number1, number2);

	// Act
	double res = calcul.multplication();

	// Assert
	assertEquals(60, res);

    }

    @Test
    void verifiyDivisionOfTwoPositiveNumbers() {

	// Arrange
	double number1 = 100;
	double number2 = 2;
	Calculator1 calcul = new Calculator1(number1, number2);

	// Act
	double res = calcul.division();

	// Assert
	assertEquals(50, res);

    }

}
