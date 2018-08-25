package com.aubay.functionnal.apres;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.aubay.functionnal.avant.Employe;
import com.aubay.functionnal.avant.EmployeException;

public class Entreprise {
	private String nom;
	private ArrayList<Employe> employes;

	public Entreprise(String nom) {
		this.nom = nom;
		employes = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void ajouter(Employe emp) throws EmployeException {
		if (!employes.add(emp)) {
			throw new EmployeException("Employé déjà dans cette entreprise");
		}
	}

	public Stream<Employe> iterator() {
		return employes.stream();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(nom);
		employes.iterator().forEachRemaining(employe -> sb.append("\n   " + employe.getNom()));
		return sb.toString();
	}
}
