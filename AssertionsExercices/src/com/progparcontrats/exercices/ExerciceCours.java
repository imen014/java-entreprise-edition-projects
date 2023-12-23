package com.progparcontrats.exercices;

/*Proposer un programme en Java qui permet de
déterminer le minimum d’un tableau T de tailleN
2. Définir une précondition dans la solution proposée.
3. Définir une postcondition dans la solution proposée.
4. Définir un invariant dans la solution proposée.*/

class FindMinTableau{
	
	
	int chercher_minimun_tableau(int[] tab) {
		
		//verifier precondition
		
		assert tab.length > 0 : "le tableau ne peut pas étre vide !";
		
		int min_initial = tab[0];
		for(int i=1 ; i < tab.length; i++ ) {
			if(tab[i] <  min_initial) {
				min_initial = tab[i];
				
				
			}
			
			//verifier postcondition
			assert min_initial  < tab[i] : "traitement non adequat";
			
			
		}
		
		
		System.out.println("le min de votre tableau est : " + min_initial);
		
		//notre invariant ici : c'est notre tableau et ses membres 
		return  min_initial;
		
	}
}

public class ExerciceCours {
	public static void main(String[] args) {
		FindMinTableau finder = new FindMinTableau();
		int[] tableau1 = {-10,2,3,4,5};
		finder.chercher_minimun_tableau(tableau1);
		
	}

}
