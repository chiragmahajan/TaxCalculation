/* 
 * Class Name    ImportedTax
 * 
 * Creation Date  15/01/2019
 * 
 * Last Updated   15/01/2019
 * 
 * ImportedTax is a class which 
 * returns tax
 */
package com.nagarro.service.impl;

public class ImportedTax implements Tax {

	@Override
	public float calculation(float price) {
		float tax = price / 10; // Imported Tax
		if ((price + tax) <= 100) {
			tax += 5;
		}

		else if ((price + tax) > 100 && (price + tax) <= 200) {
			tax += 10;
		}

		else {
			tax += tax / 20;
		}

		return tax;
	}

}
