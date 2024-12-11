package org.patterns.creational.abstractfactory;

public class OrcCastle implements Castle{
    final String Description = "Entered the ORCS castle ...";
    @Override
    public String getDescription() {
        return Description;
    }
}
