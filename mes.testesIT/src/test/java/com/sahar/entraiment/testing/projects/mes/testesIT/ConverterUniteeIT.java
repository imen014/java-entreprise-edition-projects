package com.sahar.entraiment.testing.projects.mes.testesIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConverterUniteeIT {

    @Test
    void verifyConversionGegabiteToMegabite() {
	// Arrange
	double stockage = 1;
	ConverterUnitee conversion1 = new ConverterUnitee("megabite", stockage);

	// Act
	double res = conversion1.convert_MegaBite_toGegaBites();

	// Assert
	assertEquals(1024, res);

    }

    @Test
    void verifier_if_MBite_gagnerUnGega() {

	// Arrange
	double stockage = 500;
	ConverterUnitee conversion1 = new ConverterUnitee("megabite", stockage);

	// Act
	double res = conversion1.if_MBite_gagnerUnGega();

	// Assert
	assertEquals(1524, res);

    }

    @Test
    void verify_if_TeraBite_CacherUnGega() {

	// Arrange
	double stockage = 2024;
	ConverterUnitee conversion1 = new ConverterUnitee("TeraBite", stockage);

	// Act
	double res = conversion1.if_TeraBite_CacherUnGega();

	// Assert
	assertEquals(1000, res);

    }

}
