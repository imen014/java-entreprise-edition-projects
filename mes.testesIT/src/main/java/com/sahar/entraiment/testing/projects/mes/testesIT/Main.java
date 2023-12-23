package com.sahar.entraiment.testing.projects.mes.testesIT;

public class Main {
    public static void main(String[] args) {
	String unitee1 = "GigaBite";
	double stockage_aConvertir = 1024;
	ConverterUnitee debug1 = new ConverterUnitee(unitee1, stockage_aConvertir);
	double res = debug1.convert_gigabite_toMegaBites();
	System.out
		.println("La conversion de " + stockage_aConvertir + " GigaBites en MégaBites donne : " + res + " Mo");

    }

}
