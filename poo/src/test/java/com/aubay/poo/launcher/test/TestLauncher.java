package com.aubay.poo.launcher.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aubay.poo.calculatrice.Calculatrice;

public class TestLauncher {
	
	private Calculatrice calculatrice;
	
	@BeforeEach
    public void initAll() {
		calculatrice = new Calculatrice();
    }
	
	@Test
	void testAddition() {
		assertEquals(12, calculatrice.calcule("6+6").intValue());
	}
	
	@Test
	void testSoustraction() {
		assertEquals(6, calculatrice.calcule("12-6").intValue());
	}
	
	@Test
	void testDivision() {
		assertEquals(2, calculatrice.calcule("12/6").intValue());
	}
	
	@Test
	void testComplexe() {
		assertEquals(10, calculatrice.calcule("12/6+42*2+12/10").intValue());
	}
	
	@Test
	void testMarchePas() {
		try {
			calculatrice.calcule("12");
		} catch(UnsupportedOperationException e) {
			assertEquals("operation non valide", e.getMessage());
		}
	}
	
	@Test
	void testMarchePasString() {
		try {
			calculatrice.calcule("abcd");
		} catch(UnsupportedOperationException e) {
			assertEquals("operation non valide", e.getMessage());
		}
	}
	
	@Test
	void testMarchePasStringOperation() {
		try {
			calculatrice.calcule("abcd+12");
		} catch(UnsupportedOperationException e) {
			assertEquals("operation non valide", e.getMessage());
		}
	}

}
