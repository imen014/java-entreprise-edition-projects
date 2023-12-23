package com.progparcontrats.exercices;

/*1. **Calculateur d'âge :** Créez une classe `AgeCalculator` avec une méthode pour calculer l'âge 
 * d'une personne 
en fonction de sa date de naissance. Utilisez une précondition pour vous assurer que la date de naissance 
fournie
 est valide et des postconditions pour spécifier l'âge calculé.
*/

class AgeCalculator {
	
	int calculer_age(int annee_naissance) {
		int age ;
		
		//precondition
		assert annee_naissance > 1950 : "verifier l'année de naissance !";
		
		age = 2023 - annee_naissance;
		
		//verifier post condition
		assert age == 2023 - annee_naissance : "calcul non aboutie";
		
		//et notre invariant c'est l'age
		System.out.println("votre age : " + age);
		return age;
		
		
	}
	
}

public class Calculator {
	public static void main(String[] args) {
		AgeCalculator calculator1 = new AgeCalculator();
		calculator1.calculer_age(2000);
	}

}
