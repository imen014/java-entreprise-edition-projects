package com.assertions.exercices;
/*3. Écrivez un programme qui utilise des assertions pour vérifier si une chaîne de caractères est vide
 (c'est-à-dire, sa longueur est zéro). Si la chaîne 
n'est pas vide, le programme doit générer une AssertionError.
*/

class VerificatorStrings{
	
	
	void function_verif(String chaine) {
		assert chaine.length() == 0 : "la chaine doit étre vide !";
		
		
	}
}

public class VerifLengths {
	public static void main(String[] args) {
		 VerificatorStrings testAs = new  VerificatorStrings();
		 testAs.function_verif("bonjour !");
		
		
	}

}
