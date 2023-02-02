package devices;

import creatures.Human;

import java.util.Objects;

public abstract class Car extends Device{

    final String model;
    public Double value;

    public Car(String producer, String model,Double value, int yearOfProduction) {

        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = yearOfProduction;

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car auto = (Car) o;
        return Objects.equals(this.model, auto.model) &&
                Objects.equals(this.producer, auto.producer);
    }
    public abstract void refuel();

    @Override
    public void turnOn() {
        if (!this.mode) {
            this.mode = true;
            System.out.println("Brum brum");
        } else {
            System.out.println("Już jest włączone!!!");
        }
    }

    @Override
    public void turnOff(){
        if (this.mode) {
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasACar(this)) {
            throw new Exception("Sprzedawca nie ma tego auta.");
        }
        if (!buyer.spaceChecker()) {
            throw new Exception("Kupujący nie ma więcej miejsca w garażu.");
        }
        if (!buyer.moneyChecker(price)) {
            throw new Exception("Kupujący nie ma dość pieniędzy.");
        }


        seller.removeCar(this);
        buyer.addCar(this);
        seller.addMoney(price);
        buyer.collectMoney(price);

        System.out.println("Transakcja się powiodła. To auto: " + this + " zostało sprzedane do: " + buyer);
    }
        public String toString() {
            return this.producer + " " + this.model + " " + this.yearOfProduction;
        }
        }

