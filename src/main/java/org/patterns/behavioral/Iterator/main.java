package org.patterns.behavioral.Iterator;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        Iterator<Item> iterator = chest.Iterator(Item.ItemType.POTION);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
