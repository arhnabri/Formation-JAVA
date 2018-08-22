/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu;

/**
 * Quality.
 */
public class Quality {
    private Integer value;

    public Quality(final Integer value) {
        this.value = value;
    }

    public void decrease() {
        if (!this.isTrash()) {
            --this.value;
        }
    }

    public void increase() {
        if (!this.isTopQuality()) {
            ++this.value;
        }
    }

    public final void isNowTrash() {
        this.value = 0;
    }

    public final Boolean isTrash() {
        return this.value == 0;
    }

    public final Boolean isTopQuality() {
        return this.value == 50;
    }

    public Integer getValue() {
        return this.value;
    }
}
