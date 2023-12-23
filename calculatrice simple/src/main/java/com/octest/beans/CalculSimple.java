package com.octest.beans;

public class CalculSimple {
	private float number1;
	private float number2;
	private String operator;
	
	
	
	public CalculSimple(float number1, float number2, String operator) {
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
	}
	
	public float calcul() {
		float result = 0;
		switch(operator){
		case "+":
			result = this.number1 + this.number2;
			break;
		case "-":
			if(this.number1 > this.number2) {
				result = this.number1 - this.number2;
				}else {
					result = this.number2 - this.number1;
					}
			break;
		case "*":
			result = this.number1 * this.number2;
			break;
		case "/":
			result = this.number1/this.number2;
			break;
			default:
				result = 0;
				
	
		}
		return result;
	}
	
	
	}
	
	

