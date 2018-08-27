package com.aubay.date.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class TestLauncher {

	@Test
	public void testDate() {
		// afficher la date du 27/08/2018 sous ce format.
		assertEquals("27/08/2018", "");

		// trouver le premier jour du mois d'aout 2018 
		assertEquals(DayOfWeek.WEDNESDAY, "");

		// trouver le dernier jour de l'année en cours 
		assertEquals(DayOfWeek.MONDAY, "");

		// trouver notre fuseau horaire
		assertEquals("Europe/Paris", "");

		// convertir la chaine de caractères "29/06/2019" en LocalDate
		assertEquals(LocalDate.of(2019, Month.JUNE, 29), "");
		
	}

}
