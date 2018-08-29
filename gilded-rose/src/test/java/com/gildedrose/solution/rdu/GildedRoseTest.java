package com.gildedrose.solution.rdu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.solution.rdu.items.Item;

public class GildedRoseTest {

    /*
     * Sulfuras.
     */

    @Test
    public void verifier_sulfuras_immuable() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
    }

    /*
     * Fromage.
     */

    @Test
    public void verifier_brie_augmente_qualite() {
        Item[] items = new Item[] {new Item("Aged Brie", 1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    public void verifier_brie_augmente_double_qualite_quand_expire() {
        Item[] items = new Item[] {new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    public void verifier_brie_qualite_max() {
        Item[] items = new Item[] {new Item("Aged Brie", 1, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    /*
     * Pass de concert.
     */

    @Test
    public void verifier_pass_augmente_qualite_10_jours_avant() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void verifier_pass_augmente_qualite_5_jours_avant() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    public void verifier_pass_aucune_valeur_quand_expire() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    public void verifier_pass_qualite_max() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    /*
     * Autre objet.
     */

    @Test
    public void verifier_autre_objet_decroit_en_qualite() {
        Item[] items = new Item[] {new Item("Random object", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void verifier_autre_objet_decroit_doublement_en_qualite_quand_expire() {
        Item[] items = new Item[] {new Item("Random object", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    /*
     * Conjured.
     */

    @Test
    public void verifier_conjured_decroit_en_qualite() {
        Item[] items = new Item[] {new Item("Conjured", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void verifier_conjured_decroit_doublement_en_qualite_quand_expire() {
        Item[] items = new Item[] {new Item("Conjured", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
}
