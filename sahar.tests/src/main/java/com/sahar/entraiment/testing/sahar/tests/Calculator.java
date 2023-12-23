package com.sahar.entraiment.testing.sahar.tests;

public class Calculator {

    public int add(int a, int b) {

	return a + b;
    }

    public int multiply(int a, int b) {

	return a * b;
    }

    public int soustration(int a, int b) {

	return a - b;
    }

    public int divideNumbers(int a, int b) {
	int q = 0;
	if (b > 0) {
	    q = a / b;

	} else {
	    System.out.println("verifier le diviseur !");
	}
	return q;

    }

    public boolean verifyParity(int number) {
	boolean parity;
	if (number % 2 == 0) {
	    parity = true;
	} else {
	    parity = false;
	}

	return parity;
    }

    public boolean verifyImparity(int number) {

	boolean imparity;
	if (number % 2 == 0) {
	    imparity = false;
	} else {
	    imparity = true;
	}

	return imparity;
    }

    public boolean verifyNullity(Integer number) {
	boolean verifNull;
	if (number == null) {
	    verifNull = true;
	} else {
	    verifNull = false;

	}

	return verifNull;
    }
}
