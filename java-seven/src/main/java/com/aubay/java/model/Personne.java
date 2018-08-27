package com.aubay.java.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aubay.java.exception.MyException;

public abstract class Personne {

	private String nom;
	
	private String prenom;

	private Double salaire;
	
	private String fonction;
	
	private String dateNaissance;

	public Personne() {
	}
	
	public final String getPrenom() {
		return prenom;
	}

	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public final String getFonction() {
		return fonction;
	}

	public final void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public Double getSalaire() {
		return salaire;
	}
	
	public final String getDateNaissance() {
		return dateNaissance;
	}

	public final void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String convertDate(final Date date) throws MyException {
		if (date == null) {
			throw new MyException("date non valide");
		} else {
			final SimpleDateFormat dateFormater = new SimpleDateFormat();
			return dateFormater.format(date);
		}
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", fonction=" + fonction
				+ ", dateNaissance=" + dateNaissance + "]";
	}

}
