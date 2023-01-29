package devices;

public abstract class Device {
    String producer;
    boolean mode;
    public int yearOfProduction;

    public void turnOn() {}
   public void turnOff() {}
    public String toString() {
        return "Producer: "+this.producer+ " Year of production: " + this.yearOfProduction+" Mode: " + this.mode;
    }
}
