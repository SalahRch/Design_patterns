package org.patterns.creational.factory;

public class GoldCoin implements Coin{
     final String description = "I'm a gold coin";
    @Override
    public String getDescription() {
        return description;
    }
}
