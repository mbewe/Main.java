package devices;

import creatures.Human;

public abstract class Device implements Salleable {
    public String producer;
    public boolean mode;
    public int yearOfProduction;


    public void turnOn() {
    }

    public void turnOff() {
    }

    public String toString() {
        return "Producer: " + this.producer + " Year of production: " + this.yearOfProduction + " Mode: " + this.mode;
    }
}
