package org.patterns.creational.singleton;

public class main {
    public static void main(String[] args) {
        EagerInitializationSingleton firstEager = EagerInitializationSingleton.getInstance();
        firstEager.addLog("Added log for first eager object");
        EagerInitializationSingleton secondEager = EagerInitializationSingleton.getInstance();
        secondEager.addLog("Added log for second eager object");
        System.out.println("First object's log :\n"+ firstEager.showLog());
        System.out.println("Second object's log:\n"+ secondEager.showLog());
        System.out.println("1:"+firstEager+"\n"+"2:"+secondEager+"\n");
        System.out.println("----------------------------------------\n");
        LazyInitializationSingleton firstLazy = LazyInitializationSingleton.getInstance();
        firstLazy.addLog("Added log for first lazy object");
        LazyInitializationSingleton secondLazy = LazyInitializationSingleton.getInstance();
        secondLazy.addLog("Added log for second lazy object");
        System.out.println("First object's log :\n"+ firstLazy.showLog());
        System.out.println("Second object's log:\n"+ secondLazy.showLog());
        System.out.println("1:"+firstLazy+"\n"+"2:"+secondLazy);


    }
}
