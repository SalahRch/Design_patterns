package org.patterns.creational.abstractfactory;

public class OrcsKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcsKing();
    }

    @Override
    public Army createArmy() {
        return new OrcsArmy();
    }
}
