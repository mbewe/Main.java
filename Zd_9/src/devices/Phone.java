package devices;

import creatures.Human;

public class Phone extends Device {
    int telNumber;

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {

        if (seller.tel.producer == this.producer && seller.tel.telNumber == this.telNumber) {
            if (price <= buyer.cash) {
                buyer.tel = seller.tel;
                seller.tel = null;
            } else {
                System.out.println("Kupującego nie stać!");
            }
        } else {
            System.out.println("Sprzedawca nie ma tego na sprzedaż!");
        }
    }
}

