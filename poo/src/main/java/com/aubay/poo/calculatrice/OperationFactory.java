package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public final class OperationFactory {
	
	private OperationFactory() {
		//nothing to do
	}
	
	public static Operation creerOperation(final OperationEnum operationEnum, final BigDecimal gauche, final BigDecimal droite) {
		final Operation operation;
		switch (operationEnum) {
		case PLUS:
			operation = new Addition(gauche, droite);
			break;
		case MOINS:
			operation = new Soustraction(gauche, droite);
			break;
		case DIVISE:
			operation = new Division(gauche, droite);
			break;
		case MULTIPLIE:
			operation = new Multiplication(gauche, droite);
			break;
		default:
			throw new UnsupportedOperationException("Cette operation n'existe pas");
		}
		return operation;
	}
	
	public static Operation creerOperation(final OperationEnum operationEnum) {
		final Operation operation;
		switch (operationEnum) {
		case PLUS:
			operation = new Addition();
			break;
		case MOINS:
			operation = new Soustraction();
			break;
		case DIVISE:
			operation = new Division();
			break;
		case MULTIPLIE:
			operation = new Multiplication();
			break;
		default:
			throw new UnsupportedOperationException("Cette operation n'existe pas");
		}
		return operation;
	}

}
