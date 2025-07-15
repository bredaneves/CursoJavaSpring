package com.devsuperior.services;

public class BrazilTaxService extends TaxService {

	@Override
	public double tax(double ammount) {		
		return super.tax(ammount * 0.3);
	}
	

}
