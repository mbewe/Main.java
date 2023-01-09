package creatures;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import devices.*;


public class Human  {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone tel;

    Car auto;
    String checkedProducer, checkedModel;
    Double checkedValue;
    Double salary;
    String dataSalary;
    Double valueSalary;
    String listItem;
    public Double cash = 100.0;

    List<String> historyList = new ArrayList<String>();

     public Human(String names) {
//        super("Homo sapiens");
         this.firstName = names;
    }

    public void getSalary() {
        for(String record:historyList) {
            System.out.println(record);
        }


    }
    public void setSalary() {
        Scanner input0 = new Scanner((System.in));
        System.out.println("Podaj dzisiejsza date w formacie dd/mm/rrrr:");
        dataSalary = input0.nextLine();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Ile zarobi nasz pracownik "+firstName+"?");
        valueSalary = input1.nextDouble();
        if(valueSalary > 0) {
            this.salary = Double.valueOf(String.valueOf(valueSalary));
            System.out.println("Dane księgowe zostały zaktualizowane");
            System.out.println("ZUS, US oraz Chrześcijański Zbór Świadków Jehowy zostali poinformowani o zmianie wysokości wypłaty, płacz i płać!");
            listItem = this.dataSalary + " - " + this.salary;
            historyList.add(listItem);
        }
        else{
            System.out.println("Pensja nie może być ujemna Panie Januszu!");
        }

    }
    public void getCar() {
        System.out.println(this.auto);
    }
    public void setCar() {
        Scanner input2 = new Scanner((System.in));
        System.out.println("Podaj producenta samochodu który chcesz kupić: ");
        checkedProducer = input2.nextLine();

        Scanner input3 = new Scanner((System.in));
        System.out.println("Podaj model samochodu który chcesz kupić: ");
        checkedModel = input3.nextLine();

        Scanner input4 = new Scanner((System.in));
        System.out.println("Podaj wartość samochodu który chcesz kupić: ");
        checkedValue= input4.nextDouble();

        if(checkedValue < valueSalary) {
            System.out.println("Ty bogolu, udało Ci sie kupić to auto za gotówkę");
            Car pussyMagnet = new Car(checkedProducer,checkedModel);
            this.auto = pussyMagnet;
        }
        else if(checkedValue/12 <= valueSalary) {
            System.out.println("Z wielkim trudem udało sie kupic auto na kredo");
            Car pussyMagnet = new Car(checkedProducer,checkedModel);
            this.auto = pussyMagnet;
        }
        else {
            System.out.println("Z czym do ludzi, zapisz się na jakies studia i poszukaj nowej roboty");
        }
    }

    // Zadanie 6. Punkty(4-5)
    public String toString() {
        return this.firstName + " " +this.lastName;
    }

////    @Override
////    public void sell(Human seller, Human buyer, Double price) {
//    System.out.println("Ludzie nie są na sprzedaż!");
//    }
}