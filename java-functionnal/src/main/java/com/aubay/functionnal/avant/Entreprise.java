package com.aubay.functionnal.avant;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	
	private String nom;
	private List<Employe> employes;

	public Entreprise(String nom) {
		this.nom = nom;
		employes = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}
	public final List<Employe> getEmployes() {
		return employes;
	}

	public void ajouter(final Employe emp) throws EmployeException {
		if (!employes.add(emp)) {
			throw new EmployeException("Employé déjà dans cette entreprise");
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(nom);
		for (Employe employe : employes) {
			sb.append("\n   " + employe.getNom());
		}
		return sb.toString();
	}
}
