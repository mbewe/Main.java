import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car auto;
    private Double salary;
    String dataSalary;
    Double valueSalary;
    String listItem;
    List<String> historyList = new ArrayList<String>();

    public void getSalary() {
        for (String record : historyList) {
            System.out.println(record);
        }


    }

    public void setSalary() {
        Scanner input0 = new Scanner((System.in));
        System.out.println("Podaj dzisiejsza date w formacie dd/mm/rrrr:");
        dataSalary = input0.nextLine();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Ile zarobi nasz pracownik " + firstName + "?");
        valueSalary = input1.nextDouble();
        if (valueSalary > 0) {
            this.salary = valueSalary;
            System.out.println("Dane księgowe zostały zaktualizowane, aneks odbierze z działu kadr.");
            System.out.println("ZUS, US oraz Chrześcijański Zbór Świadków Jehowy zostali poinformowani o zmianie wysokości wypłaty, płacz i płać!");
            listItem = this.dataSalary + " - " + this.salary;
            historyList.add(listItem);
        } else {
            System.out.println("Pensja nie może być ujemna Panie Januszu!");
        }
    }
}