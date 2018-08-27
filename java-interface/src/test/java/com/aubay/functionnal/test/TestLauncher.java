package com.aubay.functionnal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLauncher {

	private static final String REPONSE_HOMME = "je suis un humain;\nJe suis un homme;";
	
	private static final String REPONSE_FEMME = "je suis un humain;\nJe suis une femme;";

	@Test
	public void testInterfaceHomme() {
		//String reponse = new Homme().description();
		assertEquals(REPONSE_HOMME, "");
	}

	@Test
	public void testInterfaceFemme() {
		//String reponse = new Femme().description();
		assertEquals(REPONSE_FEMME, "");
	}

}
