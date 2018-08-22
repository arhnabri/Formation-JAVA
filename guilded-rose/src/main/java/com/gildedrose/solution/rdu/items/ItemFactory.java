/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu.items;

import com.gildedrose.solution.rdu.Quality;
import com.gildedrose.solution.rdu.SellIn;

/**
 * ItemFactory.
 */
public class ItemFactory {
    public static <T extends AbstractItem> AbstractItem create(final Item item) {
        final ItemType iType = ItemType.of(item.name);
        final Quality iQuality = new Quality(item.quality);
        final SellIn iSellIn = new SellIn(item.sellIn);
        AbstractItem newItem = null;
        switch (iType) {
        case AGED_BRIE:
            newItem = new Cheese(item.name, iType, iSellIn, iQuality, item);
            break;
        case BACKSTAGE_PASS:
            newItem = new BackstagePass(item.name, iType, iSellIn, iQuality, item);
            break;
        case SULFURAS:
            newItem = new Legendary(item.name, iType, iSellIn, new Quality(80), item);
            break;
        case CONJURED:
            newItem = new Conjured(item.name, iType, iSellIn, iQuality, item);
            break;
        default:
            newItem = new DefaultItem(item.name, iType, iSellIn, iQuality, item);
            break;
        }
        return newItem;
    }
}
