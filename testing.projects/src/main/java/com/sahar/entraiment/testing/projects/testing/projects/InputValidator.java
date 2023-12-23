package com.sahar.entraiment.testing.projects.testing.projects;

/*Validation d'entrée :
Créez une classe InputValidator avec une méthode qui valide si une chaîne de caractères 
est un numéro de téléphone valide (par exemple, un numéro avec 10 chiffres). Écrivez un test
 JUnit pour cette méthode.*/

public class InputValidator {

    public boolean verifyLength_PhoneNumber(String number) {
	boolean verifyNumber;

	if (number.length() <= 10 && number.length() > 8) {
	    verifyNumber = true;

	} else {
	    verifyNumber = false;
	}
	return verifyNumber;

    }

    public boolean verify_isDigit_phoneNumber(String number) {

	boolean verifyNumber = true;

	for (char c : number.toCharArray()) {
	    if (Character.isDigit(c)) {
		verifyNumber = true;

	    } else {
		verifyNumber = false;
	    }

	}

	return verifyNumber;

    }

}
