package devices;

public class Car extends Device{

    final String model;
    int mileage;
    String color;
    String type;
    Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car auto = (Car) o;
        return this.model == auto.model &&
                this.producer == auto.producer;
    }

    @Override
    public void turnOn() {
        if (this.mode == false) {
            this.mode = true;
            System.out.println("Brum brum");
        } else {
            System.out.println("Już jest włączone!!!");
        }
    }

    @Override
    public void turnOff(){
        if (this.mode == true) {
            this.mode = false;
            System.out.println("Pryyy");
        } else {
            System.out.println("Już jest wyłączone!!!");
        }
    }

}