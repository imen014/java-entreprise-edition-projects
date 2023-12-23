package com.sahar.entraiment.testing.projects.mes.testesIT;

/*cette classe va servir à convertisser des unitées  il va autiliser la classe calculator 
 * pour faire ceci , je le crée pour m'entrainer à creer des testes d'integration composants 
 * pour la premiére fois*/

public class ConverterUnitee {
    String unitee;
    double stockage;

    public ConverterUnitee(String unitee, double stockage) {
	this.unitee = unitee;
	this.stockage = stockage;

    }

    /* convertir de go à mo */
    double convert_gigabite_toMegaBites() {

	Calculator1 calculator = new Calculator1(this.stockage, 1024);
	if (this.unitee.equals("gigabite")) {
	    // this.stockage /= 1024;
	    this.stockage = calculator.division();
	}
	return this.stockage;
    }

    /* convertir de mo à go */
    double convert_MegaBite_toGegaBites() {

	Calculator1 calculator = new Calculator1(this.stockage, 1024);
	if (this.unitee.equals("megabite")) {
	    // this.stockage /= 1024;
	    this.stockage = calculator.multplication();
	}
	return this.stockage;
    }

    /* if_MBite_gagner_1_go */
    double if_MBite_gagnerUnGega() {

	Calculator1 calculator = new Calculator1(this.stockage, 1024);
	if (this.unitee.equals("megabite")) {
	    // this.stockage /= 1024;
	    this.stockage = calculator.addition();
	}
	return this.stockage;
    }

    /* if_TeraBite_CacherUnGega */
    double if_TeraBite_CacherUnGega() {

	Calculator1 calculator = new Calculator1(this.stockage, 1024);
	if (this.unitee.equals("TeraBite")) {
	    // this.stockage /= 1024;
	    this.stockage = calculator.soustraction();
	}
	return this.stockage;
    }

}
