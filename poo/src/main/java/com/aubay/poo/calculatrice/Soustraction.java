package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public class Soustraction extends Operation {

	public Soustraction(BigDecimal gauche, BigDecimal droite) {
		super(gauche, droite);
	}

	public Soustraction() {
		super();
	}

	@Override
	public BigDecimal faireOperation() {
		return getGauche().subtract(getDroite());
	}

}
