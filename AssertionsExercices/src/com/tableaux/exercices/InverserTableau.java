package com.tableaux.exercices;

/*3. **Inverser un tableau** : Écrivez un programme qui prend un tableau d'entiers en entrée et renvoie 
 * un tableau
 qui est l'inversion de l'original. Par exemple, si l'entrée est [1, 2, 3], la sortie doit être [3, 2, 1].
*/

class ArrayInverser{
	
	public static int[] inverser_ordre_tableau(int[] tab) {
		
		assert tab.length > 0 : "verifier le tableau ";
		
		int[] tableau_resultant = new int[tab.length];
		
		for(int i=0; i < tab.length; i++) {
			
				tableau_resultant[i] = tab[tab.length - 1 - i];

				
			}

			
		
		return tableau_resultant;
		
	}
}

public class InverserTableau {
	
	public static void main(String[] args) {
		
		int[] tab = {1,2,3,7};
		int[] show_result = ArrayInverser.inverser_ordre_tableau(tab);
		
		System.out.println("show_result inversed tab : ");
		for(int i = 0; i < show_result.length; i++) {
			System.out.print(show_result[i] + ", ");
			
		}
		
		
	}

}
