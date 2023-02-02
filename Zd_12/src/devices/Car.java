package devices;

import creatures.Human;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device{

    final String model;
    public Double value;
    public List<Human> ownerList = new ArrayList<Human>();
    public List<Transactions> transactionsHistoryList = new ArrayList<Transactions>();
    public Human curentOwner;
    public int transactionCounter = 1;

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
        } else {

            seller.removeCar(this);
            buyer.addCar(this);
            seller.addMoney(price);
            buyer.collectMoney(price);
            seller.historyList.add("Transakcja sprzedaż auta - " + price);
            buyer.historyList.add("Transakcja kupno auta - " + price * -1);
            this.ownerList.add(buyer);
            this.transactionsHistoryList.add(new Transactions(seller, buyer, price));
            this.transactionCounter++;
            this.curentOwner = buyer;


            System.out.println("Transakcja się powiodła. To auto: " + seller.firstName + " zostało sprzedane do: " + buyer.firstName);
        }
    }
    public void ownerChecker(Human human) {
        if(ownerList.contains(human)) {
            System.out.println(human.firstName + " był/jest właścicielem pojazdu.");
        } else {
            System.out.println(human.firstName + " nigdy nie był właścicielem tego pojazdu");
        }
    }
    @Override
        public String toString() {
            return this.producer + " " + this.model + " " + this.yearOfProduction;
        }
        }

