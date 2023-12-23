package com.tableaux.exercices;

/*6. **Fusionner deux tableaux triés** : Écrivez un programme qui fusionne deux tableaux triés en un 
 * seul tableau trié.
 Assurez-vous de ne pas utiliser de tableau supplémentaire.
*/

class FusionArrays{
	
	public static int[] fusionner_tableau(int[] tab1, int[] tab2) {
		int i = 0;
		do {
			tab1[tab1.length + i ] = tab2[i];
			i++;
		}while(i < tab2.length);
		
		return tab1;
	}
}

public class FusionneTableau {
	public static void main(String[] args) {
		int[] tab1 = {1,2,2,3,4,5,3,1,1,2,2,2,0};
		int[] tab2 = {10,20,30,60};
		int[] result = FusionArrays.fusionner_tableau(tab1, tab2);
		for(int i =0; i < result.length; i++) {
			System.out.print(result + ", ");
		}
		
	}

}
