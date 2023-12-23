package com.assertions.exercices;

/*1. Créez une classe pour représenter un distributeur automatique de billets. Implémentez une méthode pour retirer
 de l'argent qui peut générer une exception 
si le solde est insuffisant.
*/

class SoldeInsuffisantException extends Exception{
	public SoldeInsuffisantException() {
		super("solde insuffisant pour effectuer cette operation !");

		
	}
	
}

class MonDistribiteur {
	float solde;
	
	public MonDistribiteur(float solde) {
		this.solde = solde;
	}
	
	void distribuer_argent(float montant) {
		assert this.solde > montant : "solde induffisant";
	}
}

public class DistribiteurBillet {
	public static void main(String[] args) {
		MonDistribiteur dist1 = new MonDistribiteur(500);
		dist1.distribuer_argent(500);
		
	}

}
