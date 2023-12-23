package com.assertions.soldebancaire;


/*Créez une classe qui représente un compte bancaire avec un solde. Utilisez des assertions pour vous
 *  assurer que le solde ne devient jamais négatif.

*/

class CompteBancaire{
	private double solde;
	
	 public CompteBancaire(float solde) {
		 this.solde = solde;
	 }
	 
	 void solde_crediteur() {
		 assert this.solde > 0 : "le solde doit etre positive !";
		 System.out.println(this.solde);

	 }
	
}

public class SoldeBancAsAssertTest {
	public static void main(String[] args) {
		CompteBancaire compte1 = new CompteBancaire(-500);
		compte1.solde_crediteur();
		
		
		
	}

}
