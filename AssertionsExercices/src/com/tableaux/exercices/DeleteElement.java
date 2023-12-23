package com.tableaux.exercices;

/*5. **Supprimer un élément d'un tableau** : Écrivez un programme qui prend un tableau et un élément
 *  à supprimer 
en entrée, puis renvoie un nouveau tableau sans cet élément.
*/

class Deleter{
	
	public static void delete_element_from_array(int[] tab, int element_to_delete) {
		int[] array_cleaned = new int[tab.length];
		int j = 0;
		
		for(int i=0; i<tab.length; i++ ) {
			do {
				if(tab[i] != element_to_delete) {
					array_cleaned[j] = tab[i];
					System.out.println("array cleaned[" + j + "] : " + array_cleaned[i]);

					j++;
				}
			while( j < tab.length);
			
		}
	}

				
}
}
public class DeleteElement {

	public static void main(String[] args) {

		int[] tab = {1,2,2,2,3,4,5,6};
		Deleter.delete_element_from_array(tab, 2);

	}

}
