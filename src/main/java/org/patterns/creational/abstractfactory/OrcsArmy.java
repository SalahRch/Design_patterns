package org.patterns.creational.abstractfactory;

public class OrcsArmy implements Army{
    final String Description = "ORCS ARMY VROOM VROOM ...";
    @Override
    public String getDescription() {
        return Description;
    }
}
