package com.octest.beans;

public class ConversionDevise {
	private double montant;
	private String unitee;
	
	public ConversionDevise(double montant, String unitee) {
		this.montant = montant;
		this.unitee = unitee;
		
	}
	
	
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getUnitee() {
		return unitee;
	}
	public void setUnitee(String unitee) {
		this.unitee = unitee;
	}
	
	public double convertir() {
		
		
		if(this.unitee.equals("euro")){
			 this.montant *= 1.25;
			
		}else if(this.unitee.equals("dollar")) {
			this.montant /= 1.25;
			
		}else if(unitee.equals("dinar")) {
			this.montant *= 3.5;
		}else {
			System.out.println("verifier le montant");
		}
		
		return montant;
	}
	

}
