package com.aubay.functionnal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLauncher {

    private static final String REPONSE_HOMME = "je suis un humain;\nJe suis un homme;";

    private static final String REPONSE_FEMME = "je suis un humain;\nJe suis une femme;";

    private static final String REPONSE_NON_BINAIRE = "je suis un humain;\nJe ne suis pas un homme monsieur;";

    @Test
    public void testInterfaceHomme() {
        String reponse = "";
        // reponse = new Homme().description();
        assertEquals(REPONSE_HOMME, reponse);
    }

    @Test
    public void testInterfaceFemme() {
        String reponse = "";
        // reponse = new Femme().description();
        assertEquals(REPONSE_FEMME, reponse);
    }

    @Test
    public void testInterfaceNonBinaire() {
        String reponse = "";
        // reponse = new NonBinaire().description();
        assertEquals(REPONSE_NON_BINAIRE, reponse);
    }

}
