package com.aubay.date.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import org.junit.jupiter.api.Test;

public class TestLauncher {

	@Test
	public void testDate() {
		// afficher la date du 27/08/2018 sous ce format.
		LocalDate date = LocalDate.of(2018, Month.AUGUST, 27);
		assertEquals("27/08/2018", date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		// trouver le premier jour du mois d'aout 2018 
		LocalDate dateMer = LocalDate.of(2018, Month.AUGUST, 01);
		assertEquals(DayOfWeek.WEDNESDAY, dateMer.getDayOfWeek());

		// trouver le dernier jour de l'année en cours 
		assertEquals(DayOfWeek.MONDAY, LocalDate.now().with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());

		// trouver notre fuseau horaire
		assertEquals("Europe/Paris", ZoneId.systemDefault().toString());

		// convertir la chaine de caractères "29/06/2019" en LocalDate
		final String dateStr = "29/06/2019";
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		assertEquals(LocalDate.of(2019, Month.JUNE, 29), LocalDate.parse(dateStr, formatter));
		
	}

}
