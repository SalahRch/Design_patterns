package org.patterns.structural.facade;

public class main {
    public static void main(String[] args) {
        TheaterFacade facade = new TheaterFacade();
        facade.StartsMovie();
        facade.EndsMovie();
    }
}
