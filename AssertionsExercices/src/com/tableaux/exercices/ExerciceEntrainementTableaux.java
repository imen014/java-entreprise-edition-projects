package com.tableaux.exercices;

/*1. **Calculer la somme des éléments d'un tableau** : Écrivez un programme Java qui prend un tableau d'entiers
 en entrée et calcule la somme de tous les éléments.
*/

class CalculSommeTableau{
	
	public  int calcul_somme_tableau(int[] tab) {
		assert tab.length > 0 : "verifier les elements du tableau";
		int somme = 0;
		
		for(int i =0; i < tab.length; i++) {
			somme += tab[i];
			
		}
		System.out.println("la somme des elements du tableau : " + somme);

		return somme;
		
	}
	
}



public class ExerciceEntrainementTableaux {
	public static void main(String[] args) {
		
		CalculSommeTableau calcul1 = new CalculSommeTableau();
		int[] tableau1 =  {1,2,3};
		calcul1.calcul_somme_tableau(tableau1);
		
	}

}
