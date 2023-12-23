package com.sahar.entraiment.testing.sahar.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/*Test de chaînes de caractères : Écrivez un test qui vérifie si deux chaînes 
 * de caractères sont égales en utilisant la méthode assertEquals de JUnit.

*/

public class CalculatorTest2 {

    @Test
    void AddingTwoPositiveNumbers() {

	// Arrange
	int a = 4;
	int b = 1;
	Calculator calculator2 = new Calculator();

	// Act
	int result = calculator2.add(a, b);

	// Assert
	assertEquals(5, result);
    }

    @Test
    void multiplyTwoPositiveNumbers() {

	// Arrange
	int a = 10;
	int b = 2;
	Calculator calculator2 = new Calculator();

	// Act
	int result = calculator2.multiply(a, b);

	// Assert
	assertEquals(20, result);

    }

    @Test
    void verifySoustraction() {

	// Arrange
	int a = 15;
	int b = 10;
	Calculator calculator2 = new Calculator();

	// Act
	int result = calculator2.soustration(a, b);

	// Assert
	assertEquals(5, result);

    }

    @Test
    void verifyDivision() {

	// Arrange
	int a = 100;
	int b = 10;
	Calculator calculator2 = new Calculator();

	// Act
	int result = calculator2.divideNumbers(a, b);

	// Assert
	assertEquals(10, result);

    }

    @Test
    void verifyCancatenation() {

	// Arrange
	String chaine1 = "abc";
	String chaine2 = "def";
	VerfierCancat verif1 = new VerfierCancat();

	// Act
	String cancat1 = verif1.cancatene(chaine1, chaine2);

	// Assert
	assertEquals("abcdef", cancat1);

    }

    @Test
    void verifyEmptyList() {

	// Arrange
	ArrayList<String> maliste = new ArrayList<String>();
	VerifierListe verif1 = new VerifierListe();

	// Act
	int ListeSize = verif1.emptyliste(maliste);

	// Assert
	assertEquals(0, ListeSize);

    }

    @Test
    void verifyParity() {

	// Arrange
	int number = 100;
	Calculator calculator2 = new Calculator();

	// Act
	boolean verif1 = calculator2.verifyParity(number);

	// Assert
	assertEquals(true, verif1);

    }

    @Test
    void verifyImparity() {
	// Arrange
	int number = 101;
	Calculator calculator2 = new Calculator();

	// Act
	boolean verif1 = calculator2.verifyImparity(number);

	// Assert
	assertEquals(true, verif1);

    }

    @Test
    void VerfifyNullNumbers() {

	// Arrange
	Integer number = null;
	Calculator calculator2 = new Calculator();

	// Act
	boolean NullNumber = calculator2.verifyNullity(number);

	// Assert
	assertEquals(true, NullNumber);

    }

    @Test
    void verifyEqualityObjects() {

	// Arrange
	Personne personne1 = new Personne("ali", "ahmed", 25);
	Personne personne2 = new Personne("ali", "ahmed", 25);

	/// Act
	boolean equal_person = personne1.objectEquality(personne2);

	// Assert
	assertEquals(true, equal_person);

    }
}
