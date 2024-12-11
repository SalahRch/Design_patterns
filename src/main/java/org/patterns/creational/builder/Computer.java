package org.patterns.creational.builder;

public class Computer {
    private String HDD;
    private String RAM;

    //Optional attributes
    private boolean isGraphicsCardEnabled ;
    private boolean isBluetoothEnabled ;

    private String getHDD(){
        return HDD;
    }
    private String getRAM(){
        return RAM;
    }
    private boolean isGraphicsCardEnabled(){
        return isGraphicsCardEnabled;
    }
    private boolean isBluetoothEnabled(){
        return isBluetoothEnabled;
    }
    private Computer(ComputerBuilder computerBuilder){
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled ;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer Build(){
            return new Computer(this);
        }

    }

}
