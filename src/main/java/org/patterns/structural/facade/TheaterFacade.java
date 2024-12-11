package org.patterns.structural.facade;


import java.util.List;

public class TheaterFacade {
    private final List<Device> deviceList ;

    public TheaterFacade() {
        deviceList = List.of(
                new DVDPlayer(),
                new Lights(),
                new Projector()
        );
    }
    public void StartsMovie(){
        makeActions(deviceList, Device.Action.PREPARE, Device.Action.PLAY, Device.Action.WORK);
    }

    public void EndsMovie(){
        makeActions(deviceList , Device.Action.PAUSE , Device.Action.STOP);
    }

    public static void makeActions(List<Device> deviceList, Device.Action ... actions){
        deviceList.forEach(device -> device.action(actions));
    }
}
