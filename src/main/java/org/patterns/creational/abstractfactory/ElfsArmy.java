package org.patterns.creational.abstractfactory;

public class ElfsArmy implements Army{
    final String Description = "ELFS ARMY BOOM BOOM ...";
    @Override
    public String getDescription() {
        return Description;
    }
}
