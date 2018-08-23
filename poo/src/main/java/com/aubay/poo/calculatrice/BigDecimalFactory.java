package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public final class BigDecimalFactory {
	
	private BigDecimalFactory() {
		//nothing to do
	}
	
	public static BigDecimal creerBigDecimal(final String value) {
		try {
			return new BigDecimal(value);
		} catch (NumberFormatException e) {
			throw new UnsupportedOperationException("operation non valide");
		}
	}

}
