/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu.items;

import com.gildedrose.solution.rdu.Quality;
import com.gildedrose.solution.rdu.SellIn;

/**
 * DefaultItem.
 */
public class DefaultItem extends AbstractItem {

    /** Constructor. */
    protected DefaultItem(final String myName, final ItemType myType, final SellIn mySellIn,
        final Quality myQuality, final Item myOrigin) {
        super(myName, myType, mySellIn, myQuality, myOrigin);
    }

    @Override
    protected void updateExpired() {
        this.quality.decrease();
    }

    @Override
    protected void updateQuality() {
        this.quality.decrease();
    }

}
