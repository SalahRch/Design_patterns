package org.patterns.behavioral.Iterator;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Item {
    private ItemType type ;
    private String name;


    public Item(ItemType t, String n){
        this.type = t;
        this.name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    enum ItemType {
        POTION, RING , WEAPON

    }


}
