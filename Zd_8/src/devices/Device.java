package devices;

public abstract class Device {
    String producer;
    boolean mode;
    public int yearOfProduction;

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
