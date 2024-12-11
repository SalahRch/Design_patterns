package org.patterns.creational.abstractfactory;

public class ElfsKing implements King{
    final String Description = "Elfs king SPAWNED.";
    @Override
    public String getDescription() {
        return Description;
    }
}
