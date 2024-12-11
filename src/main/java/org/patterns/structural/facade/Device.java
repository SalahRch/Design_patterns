package org.patterns.structural.facade;



import lombok.extern.java.Log;

import java.util.Arrays;


@Log
public abstract class Device {



    public void prepare(){
        log.info(name()+ " BOOTING.");
    }
    public void play(){
        log.info(name()+" STARTING...");
    }
    public void pause(){
        log.info(name()+" PAUSE.");
    }
    public void stop(){
        log.info( name()+" SHUTS DOWN.");
    }
    private void action(Action action){
        switch (action){
            case PREPARE -> prepare();
            case PLAY -> play();
            case STOP -> stop();
            case PAUSE -> pause();
            case WORK -> work();
            default -> log.info("Undefined action");
        }

    }
    public void action(Action ... actions){
        Arrays.stream(actions).forEach(this::action);
    }
    enum Action {
        PREPARE , PLAY, PAUSE, WORK, STOP
    }
    public abstract void work();
    public abstract String name();
}
