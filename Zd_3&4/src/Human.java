import java.util.Scanner;
public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car auto;
    private Double salary;
    String dataSalary;
    Double valueSalary;


    public Double getSalary() {
        return this.salary;
    }
    public void setSalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile zarobi nasz pracownik "+firstName+"?");
        valueSalary = input.nextDouble();
        if(valueSalary > 0) {
            this.salary = valueSalary;
            System.out.println("Dane księgowe zostały zaktualizowane");
            System.out.println("ZUS, US oraz Chrześcijański Zbór Świadków Jehowy zostali poinformowani o zmianie wysokości wypłaty, płacz i płać!");
        }
        else{
            System.out.println("Pensja nie może być ujemna Panie Januszu!");
        }

    }
}