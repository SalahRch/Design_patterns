package org.patterns.behavioral.Iterator;

import java.util.Iterator;

public class TreasureChestIterator implements Iterator<Item> {
    private final TreasureChest chest;
    private int idx;
    private final Item.ItemType type;

    public TreasureChestIterator( TreasureChest chest, Item.ItemType type){
        this.chest = chest;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findnext() != -1;
    }

    @Override
    public Item next() {
        idx = findnext();
        if(idx != -1){
            return chest.getItems().get(idx);
        }
        return null;
    }

    public int findnext(){
        var items = chest.getItems();
        var tmp = idx;
        while(true){
            tmp ++;
            if(tmp >= items.size()){
                tmp = -1;
                break;
            }
            if(items.get(tmp).getType() == type){
                break;
            }
        }
        return tmp;
    }
}
