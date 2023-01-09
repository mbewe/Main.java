package devices;

import creatures.Human;

import java.sql.SQLOutput;

public class Phone extends Device implements Salleable {
    int telNumber;

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.tel != null){
            if(buyer.cash >= price){
                System.out.println("Twój " + seller.tel+ " został sprzedany " + buyer.firstName +" za " + price);
            }
            else {
                System.out.println("Nie stać tego Gamonia na "+ seller.tel);
            }
        }
        else {
            System.out.println("Sprzedawca nie ma nic na sprzedzaż");
        }
    }
}



