/*
 * Class Name    CalculationTax
 * 
 * Creation Date  15/01/2019
 * 
 * Last Updated   15/01/2019
 * 
 * CalculationTax is a class who has
 * the reference to various Tax Classes 
 * 
*/
package com.nagarro.service.impl;

public class CalculationTax {
	public Tax getInstance(String type) {
		if (type.equals("raw"))
			return new RawTax();
		else if (type.equals("manufactured"))
			return new ManufacturedTax();
		else
			return new ImportedTax();
	}

}
