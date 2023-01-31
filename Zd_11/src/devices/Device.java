package devices;

import creatures.Human;

public abstract class Device implements Salleable{
    public String producer;
    public boolean mode;
    public int yearOfProduction;
    Double value;


    public void turnOn() {

        if (this.mode == false) {
            this.mode = true;
                } else {
                    System.out.println("Już jest włączone!!!");
                }
            }
    public void turnOff(){
        if (this.mode == true) {
            this.mode = false;
        } else {
            System.out.println("Już jest wyłączone!!!");
        }
    }
    public String toString() {
        return "Producer: "+this.producer+ " Year of production: " + this.yearOfProduction+" Mode: " + this.mode;
    }
}
