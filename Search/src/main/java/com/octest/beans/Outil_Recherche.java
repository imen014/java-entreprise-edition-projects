package com.octest.beans;
import java.util.ArrayList;

public class Outil_Recherche {
	private String texte;
	private String mot;
	private String[] chaines;
	ArrayList<String> liste_resultante = new ArrayList<String>();
	
	
	public Outil_Recherche(String texte, String mot) {
		this.texte = texte;
		this.mot = mot;
		this.chaines = new String[0];
			
	}
		
	
	
	
	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	
	
	public String[] diviser_texte() {
		chaines =  this.texte.split("\\.");
		return chaines;

		}
	
	public ArrayList<String> retourner_chaines_possibles() {
		for(int i=0; i < chaines.length; i++) {
				if(chaines[i] != null) {
					if(chaines[i].contains(this.mot)) {
				
							this.liste_resultante.add( chaines[i] + " ");
				
			}
		}
		
	}
		return this.liste_resultante;
	
	
	}
}


