package org.patterns.creational.builder;

public class main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("DiskFast","FastRAM")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).Build();
        System.out.println(computer);
    }
}
