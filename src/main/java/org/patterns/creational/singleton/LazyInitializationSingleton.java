package org.patterns.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private StringBuilder logs = new StringBuilder();

    private LazyInitializationSingleton(){
        logs.append("Lazy singleton instance initialized.");
    };
    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
    public void addLog(String log){
        logs.append("\n"+log);
    }
    public String showLog(){
        return logs.toString();
    }
}
