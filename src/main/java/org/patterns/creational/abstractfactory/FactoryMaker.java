package org.patterns.creational.abstractfactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

public class FactoryMaker {

    @RequiredArgsConstructor
    @Getter
    public enum KingdomType{

        ORC(OrcsKingdomFactory::new),
        ELF(ElfsKingdomFactory::new);

        private final Supplier<KingdomFactory> factorySupplier;
    }

    public static KingdomFactory getKingdom(KingdomType type){
        return type.getFactorySupplier().get();
    }

}
