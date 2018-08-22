/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu.items;

/**
 * ItemName.
 */
public enum ItemType {
    // @formatter:off
    SULFURAS("Sulfuras, Hand of Ragnaros"), AGED_BRIE("Aged Brie"), BACKSTAGE_PASS(
        "Backstage passes to a TAFKAL80ETC concert"), CONJURED("Conjured"), DEFAULT("");
    // @formatter:on

    private final String value;

    private ItemType(final String value) {
        this.value = value;
    }

    public static ItemType of(final String value) {
        for (ItemType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return ItemType.DEFAULT;
    }

    /**
     * Getter for value.
     * @return the value
     */
    public String getValue() {
        return this.value;
    }

}
