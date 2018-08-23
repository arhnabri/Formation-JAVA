package com.aubay.poo.calculatrice;

import java.math.BigDecimal;

public abstract class Operation {
	
	private BigDecimal gauche;
	
	private BigDecimal droite;
	
	private BigDecimal resultat;
	
	private String newOperation;
	
	public Operation() {
		
	}
	
	public Operation(final BigDecimal gauche, final BigDecimal droite) {
		this.gauche = gauche;
		this.droite = droite;
	}

	public abstract BigDecimal faireOperation();

	/**
	 * @return the gauche
	 */
	public final BigDecimal getGauche() {
		return gauche;
	}

	/**
	 * @param gauche the gauche to set
	 */
	public final void setGauche(BigDecimal gauche) {
		this.gauche = gauche;
	}

	/**
	 * @return the droite
	 */
	public final BigDecimal getDroite() {
		return droite;
	}

	/**
	 * @param droite the droite to set
	 */
	public final void setDroite(BigDecimal droite) {
		this.droite = droite;
	}

	/**
	 * @return the newOperation
	 */
	public final String getNewOperation() {
		return newOperation;
	}

	/**
	 * @param newOperation the newOperation to set
	 */
	public final void setNewOperation(String newOperation) {
		this.newOperation = newOperation;
	}

	public final BigDecimal getResultat() {
		return resultat;
	}

	public final void setResultat(BigDecimal resultat) {
		this.resultat = resultat;
	}
	
}
