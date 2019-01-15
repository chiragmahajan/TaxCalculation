/* 
 * Class Name    ManufacturedTax
 * 
 * Creation Date  15/01/2019
 * 
 * Last Updated   15/01/2019
 * 
 * ManufacturedTax is a class which 
 * returns tax
 */
package com.nagarro.service.impl;

public class ManufacturedTax implements Tax {
	float tax;

	@Override
	public float calculation(float price) {
		tax = (price / 8) + (price + price / 8) / 50; // manufactured tax
		return tax;
	}

}
