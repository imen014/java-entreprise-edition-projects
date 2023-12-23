package com.tableaux.exercices;
/*2. **Trouver le plus grand élément dans un tableau** : Écrivez un programme qui trouve et affiche le plus 
grand élément d'un tableau d'entiers.
*/

class MaxFinder{
	public static int retenir_max(int[] tab) {
		assert tab.length > 0 : "tableau vide";
		int max = tab[0];
		
		for(int i=0; i < tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
			
			
		}
		System.out.println("max : " + max);
		return max;
	}
}

public class MaxInt {
	public static void main(String[] args) {
		int[] tab = {1,2,3,7};
		MaxFinder.retenir_max(tab);
		
		
		
	}

}
