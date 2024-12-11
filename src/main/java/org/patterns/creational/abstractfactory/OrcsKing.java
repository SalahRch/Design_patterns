package org.patterns.creational.abstractfactory;

public class OrcsKing implements King{
    final String Description = "Orcs king SPAWNED.";
    @Override
    public String getDescription() {
        return Description;
    }
}
