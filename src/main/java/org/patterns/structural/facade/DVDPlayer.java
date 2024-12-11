package org.patterns.structural.facade;

import lombok.extern.java.Log;


@Log
public class DVDPlayer extends Device {

    @Override
    public void work() {
        log.info(name()+" Starts playing TITANIC.");
    }

    @Override
    public String name() {
        return "DVD Player";
    }
}
