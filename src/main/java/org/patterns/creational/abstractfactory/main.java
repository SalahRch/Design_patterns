package org.patterns.creational.abstractfactory;

public class main {
    public static void main(String[] args) {
        KingdomFactory Orcskingdom = FactoryMaker.getKingdom(FactoryMaker.KingdomType.ORC);
        KingdomFactory Elfskingdom = FactoryMaker.getKingdom(FactoryMaker.KingdomType.ELF);


        System.out.println(Orcskingdom.createArmy().getDescription());
        System.out.println(Orcskingdom.createKing().getDescription());
        System.out.println(Orcskingdom.createCastle().getDescription());

        System.out.println(Elfskingdom.createArmy().getDescription());
        System.out.println(Elfskingdom.createKing().getDescription());
        System.out.println(Elfskingdom.createCastle().getDescription());




    }
}
