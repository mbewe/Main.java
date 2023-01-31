package devices;

public abstract class Car extends Device{

    final String model;
    int mileage;
    String color;
    String type;
    Double value;

    public Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = this.value;
    }
    public abstract void refuel();
}
//
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Car auto = (Car) o;
//        return this.model == auto.model &&
//                this.producer == auto.producer;
//    }

