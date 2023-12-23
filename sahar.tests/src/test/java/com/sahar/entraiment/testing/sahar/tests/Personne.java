package com.sahar.entraiment.testing.sahar.tests;

public class Personne {
    String FirstName;
    String LastName;
    int age;

    public Personne(String FirstName, String LastName, int age) {
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.age = age;

    }

    public boolean objectEquality(Personne personne2) {
	boolean equality_person;
	if (this.FirstName == personne2.FirstName && this.LastName == personne2.LastName && this.age == personne2.age) {

	    equality_person = true;
	} else {
	    equality_person = false;

	}

	return equality_person;
    }

}
