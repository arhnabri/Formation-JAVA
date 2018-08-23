package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public class Addition extends Operation {

	public Addition(BigDecimal gauche, BigDecimal droite) {
		super(gauche, droite);
	}

	public Addition() {
		super();
	}

	@Override
	public BigDecimal faireOperation() {
		return getGauche().add(getDroite());
	}

}
