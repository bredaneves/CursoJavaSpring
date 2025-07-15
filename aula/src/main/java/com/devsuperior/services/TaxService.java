package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	public double tax(double ammount) {
		return ammount * 0.2;
	}
}
