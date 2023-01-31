package devices;


public class Diesel extends Car {
    int batteryPower = 1;

    public Diesel(String producer, String model) {
        super(producer, model);
    }


    @Override
    public void refuel() {
        this.batteryPower = 100;

    }
}

