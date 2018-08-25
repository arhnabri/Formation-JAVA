package com.aubay.functionnal.avant;

public class Employe {
	
	private String nom;
	
	private String prenom;

	private Double salaire;
	
	private Integer age;
	
	private String fonction;

	public Employe(final String nom, final String prenom, final String fonction, Double salaire, final Integer age) {
		this.nom = nom;
		this.salaire = salaire;
		this.prenom = prenom;
		this.fonction = fonction;
		this.age = age;
	}
	
	public final String getPrenom() {
		return prenom;
	}

	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public final Integer getAge() {
		return age;
	}

	public final void setAge(Integer age) {
		this.age = age;
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

	public final void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public double getSalaire() {
		return salaire;
	}
}
