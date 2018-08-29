/**
 * (C) Copyright 2017 FranceAgriMer (http://www.franceagrimer.fr). FranceAgriMer, Établissement National des
 * Produits de l’Agriculture et de la Mer. Tout ou partie du présent code ne peut être copié et/ou distribué sans
 * l'accord formel de FranceAgriMer.
 */
package com.gildedrose.solution.rdu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gildedrose.solution.rdu.items.AbstractItem;
import com.gildedrose.solution.rdu.items.Item;
import com.gildedrose.solution.rdu.items.ItemFactory;

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
    List<AbstractItem> itemsList;
    Item[] items;

    public GildedRose(final Item[] items) {
        this.items = items;
        this.itemsList = Arrays.asList(items).stream().map(ItemFactory::create).collect(Collectors.toList());
    }

    public void updateQuality() {
        this.itemsList.forEach(AbstractItem::updateOneItem);
    }
}
