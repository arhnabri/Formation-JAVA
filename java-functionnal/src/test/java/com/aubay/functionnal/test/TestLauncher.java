package com.aubay.functionnal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.aubay.functionnal.avant.CompareSalaire;
import com.aubay.functionnal.avant.CompareSalaireInverse;
import com.aubay.functionnal.avant.Employe;
import com.aubay.functionnal.avant.EmployeException;
import com.aubay.functionnal.avant.Entreprise;

public class TestLauncher {

	@Test
	public void testSansFonctionnel() throws EmployeException {
		Entreprise e1 = new Entreprise("MI6");
		e1.ajouter(new Employe("Connery", "Sean", "Agent secret", Double.valueOf(5300), 87));
		e1.ajouter(new Employe("Lazenby", "George", "Tueur", Double.valueOf(6000), 78));
		e1.ajouter(new Employe("Moore", "Roger", "Developpeur", Double.valueOf(5700), 89));
		e1.ajouter(new Employe("Dalton", "Thimothy", "Chanteur", Double.valueOf(7500), 72));
		e1.ajouter(new Employe("Brosnan", "Pierce ", "Developpeur", Double.valueOf(4800), 65));
		e1.ajouter(new Employe("Craig", "Daniel", "Agent secret", Double.valueOf(4300), 50));
		System.out.println(e1);

		// Remplit une liste avec les employés
		final List<Employe> l = new ArrayList<>();
		for (Employe e : e1) {
			l.add(e);
		}

		// Tri par salaires croissants
		CompareSalaire comparateur = new CompareSalaire();
		Collections.sort(l, comparateur);
		assertEquals("Craig", l.get(0).getNom());
		assertEquals("Brosnan", l.get(1).getNom());
		assertEquals("Connery", l.get(2).getNom());
		assertEquals("Moore", l.get(3).getNom());
		assertEquals("Lazenby", l.get(4).getNom());
		assertEquals("Dalton", l.get(5).getNom());
		
		// Tri par salaires decroissants
		CompareSalaireInverse comparateurInverse = new CompareSalaireInverse();
		Collections.sort(l, comparateurInverse);
		assertEquals("Craig", l.get(5).getNom());
		assertEquals("Brosnan", l.get(4).getNom());
		assertEquals("Connery", l.get(3).getNom());
		assertEquals("Moore", l.get(2).getNom());
		assertEquals("Lazenby", l.get(1).getNom());
		assertEquals("Dalton", l.get(0).getNom());
		
		//Qui est le plus vieux
		Integer maxAge = Integer.valueOf(0);
		for (Employe e : e1) {
			if (e.getAge() > maxAge) {
				maxAge = e.getAge();
			}
		}
		assertEquals(Integer.valueOf(89), maxAge);

		//Salaire moyen 
		Double salaireMoyen = Double.valueOf(0);
		Integer nbEmploye = Integer.valueOf(0);
		for (Employe e : e1) {
			salaireMoyen += e.getSalaire();
			nbEmploye++;
		}
		assertEquals(Double.valueOf(5600), Double.valueOf(salaireMoyen / nbEmploye));
		
		//Trouver les différents développeurs
		final List<Employe> listDev = new ArrayList<>();
		for (Employe e : e1) {
			if (e.getFonction().equals("Developpeur")) {
				listDev.add(e);
			}
		}
		assertEquals("Moore", listDev.get(0).getNom());
		assertEquals("Brosnan", listDev.get(1).getNom());
		
		//Combien de James Bond sont agents secret
		Integer nbDeveloppeur = Integer.valueOf(0);
		for (Employe e : e1) {
			if (e.getFonction().equals("Agent secret")) {
				nbDeveloppeur++;
			}
		}
		assertEquals(nbDeveloppeur, Integer.valueOf(2));
	}

}
