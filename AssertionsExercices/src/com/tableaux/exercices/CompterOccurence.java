package com.tableaux.exercices;

/*4. **Compter les occurrences d'un élément dans un tableau** : Écrivez un programme qui compte le nombre 
 * de fois 
qu'un élément particulier apparaît dans un tableau.
*/

class OccurencyCounter{
	
	public static int compter_apparitient_element(int[] tab , int element_en_question) {
		int count = 0;
		
		for(int i= 0; i < tab.length; i++) {
			if(tab[i] == element_en_question) {
				count++;
			}
			
		}
		System.out.println("le nombre d'apparitiont de " + element_en_question + " est : " + count);
		return count;
		
	}
}

public class CompterOccurence {
	public static void main(String[] args) {
		int[] tab = {1,2,2,1,2,2, 2, 4, 5};
		OccurencyCounter.compter_apparitient_element(tab, 0);
		
	}

}
