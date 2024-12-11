package org.patterns.creational.abstractfactory;

public class ElfsCastle implements Castle{
    final String Description = "Entered the ELFS castle ...";
    @Override
    public String getDescription() {
        return Description;
    }
}
