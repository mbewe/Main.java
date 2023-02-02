package devices;


public class LPG extends Car {
    int batteryPower = 1;

    public LPG(String producer, String model, Double value) {
        super(producer, model, value);
    }


    @Override
    public void refuel() {
        this.batteryPower = 100;

    }
}
