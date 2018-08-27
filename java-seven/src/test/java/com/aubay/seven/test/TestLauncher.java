package com.aubay.seven.test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import com.aubay.java.exception.MyException;
import com.aubay.java.model.Femme;
import com.aubay.java.model.Homme;
import com.aubay.java.model.Personne;

public class TestLauncher {

	@Test
	public void testJava7() {
		try {
			final Path excelFile = FileSystems.getDefault().getPath("./src/test/resources/exemple.xlsx");
			try (final InputStream is = Files.newInputStream(excelFile);
					final Workbook workbook = new XSSFWorkbook(is)) {
				final List<Personne> personnes = new ArrayList<>();
				final Iterator<Sheet> sheetIterator = workbook.sheetIterator();
				while (sheetIterator.hasNext()) {
					final Sheet sheet = sheetIterator.next();
					final Iterator<Row> rowIterator = sheet.rowIterator();
					while (rowIterator.hasNext()) {
						final Row row = rowIterator.next();
						final Personne personne;
						final List<String> elements = new ArrayList<>();
						final List<Double> ages = new ArrayList<>();
						final List<Date> dateNaissance = new ArrayList<>();
						final Iterator<Cell> iteratorCell = row.cellIterator();
						while (iteratorCell.hasNext()) {
							final Cell cell = iteratorCell.next();
							if (CellType.STRING.equals(cell.getCellTypeEnum())) {
								elements.add(cell.getStringCellValue());
							} else if (CellType.NUMERIC.equals(cell.getCellTypeEnum())) {
								if (HSSFDateUtil.isCellDateFormatted(cell)) {
									dateNaissance.add(cell.getDateCellValue());
								} else {
									ages.add(cell.getNumericCellValue());	
								}
							}
						}
						switch (elements.get(0)) {
						case "H":
							personne = new Homme();
							break;
						case "F":
							personne = new Femme();
							break;
						default:
							personne = null;
							break;
						}
						personne.setNom(elements.get(1));
						personne.setPrenom(elements.get(2));
						personne.setFonction(elements.get(3));
						personne.setSalaire(ages.get(0));
						personne.setDateNaissance(personne.convertDate(dateNaissance.get(0)));
						personnes.add(personne);
					}
					;
				}
				personnes.stream().forEach(System.out::println);
			}
		} catch (IOException | MyException e) {
			e.printStackTrace();
		}

	}

}
