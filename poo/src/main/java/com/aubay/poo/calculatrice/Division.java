package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public class Division extends Operation {

	public Division(BigDecimal gauche, BigDecimal droite) {
		super(gauche, droite);
	}

	public Division() {
		super();
	}

	@Override
	public BigDecimal faireOperation() {
		return getGauche().divide(getDroite());
	}

}
