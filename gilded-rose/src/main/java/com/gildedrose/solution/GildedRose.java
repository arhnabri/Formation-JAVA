/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution;

// ***************************************************************************
// Copyright (c) 2016, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

class GildedRose {
    Item[] items;

    public GildedRose(final Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : this.items) {
            ItemCategory category = this.categorize(item);
            category.updateOneItem(item);
        }
    }

    private ItemCategory categorize(final Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Legendary();
        }
        if (item.name.equals("Aged Brie")) {
            return new Cheese();
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePass();
        }
        if (item.name.startsWith("Conjured")) {
            return new Conjured();
        }
        return new ItemCategory();
    }

    private class ItemCategory {
        protected void incrementQuality(final Item item) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }

        protected void decrementQuality(final Item item) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }

        protected void updateExpired(final Item item) {
            this.decrementQuality(item);
        }

        protected void updateSellIn(final Item item) {
            item.sellIn = item.sellIn - 1;
        }

        protected void updateQuality(final Item item) {
            this.decrementQuality(item);
        }

        private void updateOneItem(final Item item) {
            this.updateQuality(item);

            this.updateSellIn(item);

            if (item.sellIn < 0) {
                this.updateExpired(item);
            }
        }
    }

    private class Legendary extends ItemCategory {
        @Override
        protected void updateExpired(final Item item) {
        }

        @Override
        protected void updateSellIn(final Item item) {
        }

        @Override
        protected void updateQuality(final Item item) {
        }
    }

    private class Cheese extends ItemCategory {
        @Override
        protected void updateExpired(final Item item) {
            this.incrementQuality(item);
        }

        @Override
        protected void updateQuality(final Item item) {
            this.incrementQuality(item);
        }
    }

    private class BackstagePass extends ItemCategory {

        @Override
        protected void updateExpired(final Item item) {
            item.quality = 0;
        }

        @Override
        protected void updateQuality(final Item item) {
            this.incrementQuality(item);

            if (item.sellIn <= 10) {
                this.incrementQuality(item);
            }

            if (item.sellIn <= 5) {
                this.incrementQuality(item);
            }
        }

    }

    private class Conjured extends ItemCategory {
        @Override
        protected void updateExpired(final Item item) {
            this.decrementQuality(item);
            this.decrementQuality(item);
        }

        @Override
        protected void updateQuality(final Item item) {
            this.decrementQuality(item);
            this.decrementQuality(item);
        }
    }

}
