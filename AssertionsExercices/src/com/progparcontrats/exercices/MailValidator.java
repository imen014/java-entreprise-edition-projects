package com.progparcontrats.exercices;

/*2. **Validation d'adresse e-mail :** Écrivez une méthode qui valide une adresse e-mail en vérifiant si elle 
contient un "@" et un domaine valide. Utilisez une précondition pour vérifier la structure de l'adresse e-mail 
et une postcondition pour indiquer si l'adresse est valide.
*/

class AdresseMailValidator{
	
	String verify_mail_address(String username, String mail) {
		//l'objectif de cette fonction est de fournir une adresse mail valide en fonction du nom utilisateur
		
		//verifier precondition
		assert mail.contains("@") && mail.matches(".*@(gmail|yahoo|hotmail)\\.com$") : "verifier l'adresse fournie";
		
		String adresse_valide =username + mail;
		
		//verifier postcondition
		assert adresse_valide.contains(username);
		
		//ici l'invariant c'est la structure de l'email et le username
		System.out.println("votre nouvelle adresse mail est : " + adresse_valide);
		return adresse_valide;
		
	}
}

public class MailValidator {

	public static void main(String[] args) {

		AdresseMailValidator adresse1 = new AdresseMailValidator();
		adresse1.verify_mail_address("sami", "@gmail.com");
		adresse1.verify_mail_address("sahar", "@gmail.com");
		adresse1.verify_mail_address("sami", "@yahoo.com");



	}

}
