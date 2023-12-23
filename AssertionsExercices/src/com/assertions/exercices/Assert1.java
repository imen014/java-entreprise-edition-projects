package com.assertions.exercices;

/*1. Écrivez un programme Java qui utilise des assertions pour vérifier
 *  si un nombre est positif. Si le nombre 
est négatif, le programme doit générer 
une AssertionError.*/

class AssertionTest1 {

    void verifyPositiveNumber(int number) {
    	/*if(number > 0) {
    		System.out.println("ok!");

    		
    		
    	}else {
    		System.out.println("pas ok !");
    		
    	}*/
    	
    	assert number>0:"pas ok !";
	

    }

}

public class Assert1 {

    public static void main(String[] args) {
	AssertionTest1 obj1 = new AssertionTest1();
	obj1.verifyPositiveNumber(5);
	obj1.verifyPositiveNumber(-100);
	obj1.verifyPositiveNumber(-100);


    }

}
