/* 
 * Class Name    RawTax
 * 
 * Creation Date  15/01/2019
 * 
 * Last Updated   15/01/2019
 * 
 * RawTax is a class which 
 * returns tax
 */
package com.nagarro.service.impl;

public class RawTax implements Tax {
	float tax;

	@Override
	public float calculation(float price) {
		tax = price / 8;
		return tax;
	}

}
