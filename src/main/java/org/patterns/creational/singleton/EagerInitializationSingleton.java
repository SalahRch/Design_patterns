package org.patterns.creational.singleton;

import lombok.Getter;


public class EagerInitializationSingleton {

    @Getter
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private StringBuilder logs = new StringBuilder();
    private EagerInitializationSingleton(){
        logs.append("Eager singleton instance initialized.");
    };
    public void addLog(String log){
        logs.append("\n"+log);
    }
    public String showLog(){
        return logs.toString();
    }

}
