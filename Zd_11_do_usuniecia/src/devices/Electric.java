package devices;


public class Electric extends Car {
    int batteryPower = 1;

    public Electric(String producer, String model, Double value) {
        super(producer, model, value);
    }


    @Override
    public void refuel() {
    this.batteryPower = 100;

    }
}

