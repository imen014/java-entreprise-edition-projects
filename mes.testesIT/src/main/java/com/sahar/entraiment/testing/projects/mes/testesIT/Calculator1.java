package com.sahar.entraiment.testing.projects.mes.testesIT;

public class Calculator1 {
    double number1;
    double number2;

    public Calculator1(double number1, double number2) {
	this.number1 = number1;
	this.number2 = number2;

    }

    double soustraction() {
	return this.number1 - this.number2;

    }

    double multplication() {
	return this.number1 * this.number2;

    }

    double division() {
	return this.number1 / this.number2;

    }

    double addition() {
	return this.number1 + this.number2;

    }

}
