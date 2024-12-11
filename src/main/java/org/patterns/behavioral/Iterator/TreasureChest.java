package org.patterns.behavioral.Iterator;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class TreasureChest {
    List<Item> items ;

    public TreasureChest(){
        items = List.of(
                new Item(Item.ItemType.POTION, "Potion of courage"),
                new Item(Item.ItemType.RING, "Ring of shadows"),
                new Item(Item.ItemType.POTION, "Potion of wisdom"),
                new Item(Item.ItemType.POTION, "Potion of blood"),
                new Item(Item.ItemType.WEAPON, "Sword of silver +1")
        );
    }

    public List<Item> getItems(){
        return new ArrayList<>(items);
    }


    public Iterator<Item> Iterator(Item.ItemType type){
        return new TreasureChestIterator(this, type);
    }
}
