package com.progparcontrats.exercices;

/*segmentation tableau par rapport à un membre de tableau*/

class SegmentationTableau{
	
	//fonction find membre
	boolean finder(int[] tableau, int x) {
		
		//verifier precondition pour tableau 1
		assert tableau.length > 0 : "verifier la taille de tableau";
		boolean trouve = true;
		
		for(int i =0; i<tableau.length; i++) {
			if(tableau[i] != x) {
				trouve = false;
				
				
			}
		}
		return trouve;
		
		
	}
	
	int[] fix_centralize_element(int[] tableau, int x) {
		int indice = tableau.length / 2;
		tableau[indice] = x;
		
		
		assert tableau[indice] == x : "tableau non centralisé";
		return tableau;
	}
	

	int[] segmenter_tableau(int[] tableau, int x) {
		int[] tableau_resultant = new int[tableau.length];
		tableau_resultant[0] = tableau[0];
		assert tableau_resultant.length > 0 : "veuillez initialiser le nouveau tableau";
		int jmax = tableau_resultant.length;

		for(int i =0; i < tableau.length; i++) {
			for(int j = 0; i < tableau_resultant.length; j++) {
				if(tableau[i]< x) {
					tableau_resultant[j] = tableau[i];
				}else if(tableau[i] > x && tableau[i] > tableau[i-1]) {
					tableau_resultant[jmax] =  tableau[i];
					j--;
					
				}
				
			}

			
		}
		return tableau_resultant;
	}
}

public class Tp1Exercice {

}
