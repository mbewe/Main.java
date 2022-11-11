public class Car {



    String producer;
    final String model;
    int mileage;
    String color;
    int year;
    String type;
    Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return "Producer: " + this.producer + " Model: " + this.model;
    }
}