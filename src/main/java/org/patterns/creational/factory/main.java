package org.patterns.creational.factory;

public class main {
    public static void main(String[] args) {
       Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
       Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);

        System.out.println(copperCoin.getDescription());
        System.out.println(goldCoin.getDescription());
    }
}
