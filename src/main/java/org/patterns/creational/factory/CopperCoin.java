package org.patterns.creational.factory;

public class CopperCoin implements Coin{

     final String Description ="I'm a copper coin";

    @Override
    public String getDescription() {
        return Description;
    }
}
