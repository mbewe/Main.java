package devices;

import creatures.Human;

public abstract class Car extends Device{

    final String model;
    int mileage;
    String color;
    String type;
    public Double value;

    public Car(String producer, String model,Double value) {

        this.producer = producer;
        this.model = model;
        this.value = value;

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
    public abstract void refuel();

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
    public int getYearOfProduction(){
        return this.yearOfProduction;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
//        if (seller.auto.producer == this.producer || seller.auto.model == this.model ) {
//            if (price <= buyer.cash) {
//                buyer.auto = seller.auto;
//                seller.auto = null;
//            } else {
//                System.out.println("Kupującego nie stać!");
//            }
//        } else {
//            System.out.println("Sprzedawca nie ma tego na sprzedaż!");
//        }
   }
}