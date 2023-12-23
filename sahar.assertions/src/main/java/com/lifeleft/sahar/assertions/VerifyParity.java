package com.lifeleft.sahar.assertions;

public class VerifyParity {

    public boolean verifyParityNumber(int number) {
	boolean verified;

	if (number % 2 == 0) {
	    verified = true;

	} else {
	    verified = false;

	}

	return verified;
    }

}
