package com.assertions.exercices;
/*  a. Créez une classe qui effectue des calculs mathématiques et utilise des assertions pour vérifier 
que les résultats sont corrects.*/

class Calculatrice{
	float number1 , number2;
	String operator;
	
	public Calculatrice(float number1, float number2, String operator) {
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;

	}
	
	void calcul_possible() {
		float result ;
		switch(operator) {
		case "+" :
			assert (this.number1 > 0) && (this.number2 > 0) : "nombres non positifs !";
			result = this.number1+ this.number2;
			System.out.println("l'addition donne : " + result);
			break;
			
		case "-" :
			assert this.number1 > this.number2  : "number 1 inf number2 !";
			result = this.number1 - this.number2;
			System.out.println("la soustraction donne : " + result);
			break;
		case "*" :
			assert (this.number1 != 0) && (this.number2 != 0) : "multiplication par zero donne tjrs zero !";

			result = this.number1*this.number2;
			System.out.println("la multiplication donne : " + result);
			break;	
		case "/" :
			assert (this.number1 > this.number2) && (this.number2 != 0) : "number2 null ou bien sup à number1 !";

			result = this.number1 / this.number2;
			System.out.println("la division donne : " + result);
			break;
		default:
			System.out.println("verifier votre operateur");
			}
	}
}

public class Calculator {
	public static void main(String[] args) {
		Calculatrice calcul1 = new Calculatrice(5,7,"/");
		calcul1.calcul_possible();
		
		
	}

}
