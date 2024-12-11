package org.patterns.structural.facade;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;



@Log
public class Lights extends Device{




    @Override
    public void work() {
        log.info(name()+ " Turns on the lights ... ");
    }

    @Override
    public String name() {
        return "Lights";
    }
}
