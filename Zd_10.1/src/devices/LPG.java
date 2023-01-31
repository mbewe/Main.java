package devices;


public class LPG extends Car {
    int batteryPower = 1;

    public LPG(String producer, String model) {
        super(producer, model);
    }


    @Override
    public void refuel() {
        this.batteryPower = 100;

    }
}
