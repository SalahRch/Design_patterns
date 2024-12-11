package org.patterns.structural.facade;


import lombok.extern.java.Log;

@Log
public class Projector extends Device{

    @Override
    public void work() {
        log.info(name() +" Starts projecting the movie ...");
    }

    @Override
    public String name() {
        return "Projector";
    }
}
