package org.patterns.creational.abstractfactory;




public class ElfsKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new ElfsCastle();
    }

    @Override
    public King createKing() {
        return new ElfsKing();
    }

    @Override
    public Army createArmy() {
        return new ElfsArmy();
    }


}
