package com.aubay.functionnal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.aubay.functionnal.avant.Employe;
import com.aubay.functionnal.avant.EmployeException;
import com.aubay.functionnal.avant.Entreprise;

public class TestLauncherFonctionnel {

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
		final List<Employe> l = e1.getEmployes();
		
		// Tri par salaires croissants
		l.sort((emp1, emp2) -> Double.compare(emp1.getSalaire(), emp2.getSalaire()));
		assertEquals("Craig", l.get(0).getNom());
		assertEquals("Brosnan", l.get(1).getNom());
		assertEquals("Connery", l.get(2).getNom());
		assertEquals("Moore", l.get(3).getNom());
		assertEquals("Lazenby", l.get(4).getNom());
		assertEquals("Dalton", l.get(5).getNom());
		
		// Tri par salaires decroissants
		l.sort((emp1, emp2) -> Double.compare(emp2.getSalaire(), emp1.getSalaire()));
		assertEquals("Craig", l.get(5).getNom());
		assertEquals("Brosnan", l.get(4).getNom());
		assertEquals("Connery", l.get(3).getNom());
		assertEquals("Moore", l.get(2).getNom());
		assertEquals("Lazenby", l.get(1).getNom());
		assertEquals("Dalton", l.get(0).getNom());
		
		//Qui est le plus vieux
		Optional<Employe> employeMaxAge = l.stream().max((emp1, emp2) -> Integer.compare(emp1.getAge(), emp2.getAge()));
		assertEquals(Integer.valueOf(89), employeMaxAge.get().getAge());

		//Salaire moyen 
		OptionalDouble salaireMoyen = l.stream().mapToDouble(Employe::getSalaire).average();
		assertEquals(Double.valueOf(5600), Double.valueOf(salaireMoyen.getAsDouble()));
		
		//Trouver les différents développeurs
		final List<Employe> listDev = l.stream().filter(emp -> "Developpeur".equals(emp.getFonction())).collect(Collectors.toList());
		assertEquals("Moore", listDev.get(0).getNom());
		assertEquals("Brosnan", listDev.get(1).getNom());
		
		//Combien de James Bond sont agents secret
		Integer nbDeveloppeur = (int) l.stream().filter(emp -> "Developpeur".equals(emp.getFonction())).count();
		assertEquals(nbDeveloppeur, Integer.valueOf(2));
	}

}
