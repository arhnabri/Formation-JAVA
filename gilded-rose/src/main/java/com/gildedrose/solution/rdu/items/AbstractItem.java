/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu.items;

import com.gildedrose.solution.rdu.Quality;
import com.gildedrose.solution.rdu.SellIn;

public abstract class AbstractItem {

    public final ItemType type;

    public final String name;

    public final SellIn sellIn;

    public final Quality quality;

    public final Item origin;

    protected AbstractItem(final String name, final ItemType type, final SellIn sellIn, final Quality quality,
        final Item origin) {
        this.name = name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
        this.origin = origin;
    }

    private void updateOrigin() {
        this.origin.quality = this.quality.getValue();
        this.origin.sellIn = this.sellIn.getValue();
    }

    public final void updateOneItem() {
        this.updateQuality();

        this.updateSellIn();

        if (this.sellIn.worthNothing()) {
            this.updateExpired();
        }

        // update by reference
        this.updateOrigin();
    }

    protected void updateSellIn() {
        this.sellIn.update();
    };

    protected abstract void updateExpired();

    protected abstract void updateQuality();

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
