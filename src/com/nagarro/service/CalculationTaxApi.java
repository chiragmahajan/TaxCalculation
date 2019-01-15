/* 
 * Class Name    CalculationTaxApi
 * 
 * Creation Date  15/01/2019
 * 
 * Last Updated   15/01/2019
 * 
 * CalculationTaxApi is a class whose reference
 * is used by outside world to calculate tax 
 */
package com.nagarro.service;

import com.nagarro.service.impl.CalculationTax;
import com.nagarro.service.impl.Tax;

public class CalculationTaxApi {

	public float calculate(String type, float price) {
		CalculationTax obj = new CalculationTax();
		Tax cal = obj.getInstance(type);
		return cal.calculation(price);
	}
}
