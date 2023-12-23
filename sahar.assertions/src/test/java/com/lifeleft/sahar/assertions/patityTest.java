package com.lifeleft.sahar.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.*;

public class patityTest {

    @ParametrizdTest("test de fonction de parité")
    @values(1,2)
    void verifyParityPositiveNumber(int number) {
	
	//Arrange
	    VerifyParity verif1 = new VerifyParity();
	    
	    //Act
	    boolean estIlPair = verif1.verifyParityNumber(int value);

    // Assert
    assertEquals(true, estIlPair);
	
    }

}
