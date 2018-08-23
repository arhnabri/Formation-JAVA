package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public class Multiplication extends Operation {

	public Multiplication(BigDecimal gauche, BigDecimal droite) {
		super(gauche, droite);
	}

	public Multiplication() {
		super();
	}

	@Override
	public BigDecimal faireOperation() {
		return getGauche().multiply(getDroite());
	}

}
