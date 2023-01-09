package creatures;

import devices.Salleable;
import creatures.Human;

public  class Animal implements Salleable {

    static final public Double DEFAULT_DOG_WEIGHT = 12.3;
    static final public Double DEFAULT_CAT_WEIGHT = 5.1;
    private static final Double DEFAULT_WORM_WEIGHT =0.25;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    public Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;


        switch (specie) {
            case "canis" :
                this.weight = DEFAULT_DOG_WEIGHT;
                break;

            case "cat" :
                this.weight = DEFAULT_CAT_WEIGHT;
                break;

            case "worm" :
                this.weight = DEFAULT_WORM_WEIGHT;
                break;

            default :
                System.out.println("nie ma takiego zwierzęcia");
        }


    }

    void feed() {
        if (this.isAlive == true) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
            this.isAlive = false;
        } else {
            System.out.println("Wszystko dobrze z głową?");
        }
    }

    void takeForAWalk() {

        if (this.isAlive == true) {
            if (this.isAlive == true) {
                this.weight -= 5.25;
                if (this.weight <= 0) {
                    System.out.println("Zwierze nie żyje, dzwonie na Policje !");
                } else {
                    System.out.println("Dzięki za spacer!!!");
                }
            }

        } else {
            System.out.println("Dzwonie na Policje !!!");
        }
    }

    public String toString() {return this.specie + " " + this.name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null) {
            if (price <= buyer.salary) {
                buyer.pet = seller.pet;
                seller.pet = null;
            } else {
                System.out.println("Kupującego nie stać!");
            }
        } else {
            System.out.println("Sprzedawca nie ma tego na sprzedaż!");
        }
    }
}