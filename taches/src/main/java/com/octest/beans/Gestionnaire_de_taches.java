package com.octest.beans;
import java.util.ArrayList;


public class Gestionnaire_de_taches {
	private String tache;
	ArrayList<String> taches = new ArrayList<String>();
	
	public Gestionnaire_de_taches(String tache) {
		this.tache = tache;
	}
	
	public void ajouter_taches(String tache) {
		taches.add(tache);
		
	}
	public void supprimer_tache(String tache) {
		taches.remove(tache);
	}
	
	public ArrayList<String> afficher_liste_taches() {
		return taches;
	}
	

}
