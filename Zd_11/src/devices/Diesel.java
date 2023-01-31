package devices;


public class Diesel extends Car {
    int batteryPower = 1;

    public Diesel(String producer, String model, Double value) {
        super(producer, model, value);
    }


    @Override
    public void refuel() {
        this.batteryPower = 100;

    }
}

