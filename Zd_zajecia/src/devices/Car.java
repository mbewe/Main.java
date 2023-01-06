package devices;

public class Car extends Device{




    int mileage;
    String color;
    int year;
    String type;
    Double value;

    public Car(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowano");
    }

    //  public String toString() {
  //      return "Producer: " + this.producer + " Model: " + this.model;
  //  }
}