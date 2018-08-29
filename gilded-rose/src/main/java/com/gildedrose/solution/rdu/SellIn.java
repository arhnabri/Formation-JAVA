/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu;

/**
 * SellIn.
 */
public class SellIn {
    private Integer value;

    public SellIn(final Integer value) {
        this.value = value;
    }

    public void update() {
        --this.value;
    }

    public Boolean worthNothing() {
        return this.value < 0;
    }

    /**
     * Getter for value.
     * @return the value
     */
    public final int getValue() {
        return this.value;
    }
}
