package com.octest.beans;
import java.util.ArrayList;

public class My_Blog {
	private String tache;
	ArrayList<String> liste_taches = new ArrayList<String>();

	public String getTache() {
		return tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}
	
	public void ajouter_tache(String tache) {
		liste_taches.add(tache);
	}
	
	public void supprimer_tache(String tache) {
		liste_taches.remove(tache);
	}
	
	public ArrayList<String> retourner_tache() {
		return liste_taches;
	}

}
