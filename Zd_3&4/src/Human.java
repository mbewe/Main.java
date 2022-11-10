public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car auto;
    private Double salary;

    public Double getSalary() {
        return this.salary;
    }
    public void setSalary(Double value) {
        if(value > 0) {
            this.salary = value;
            System.out.println("Dane księgowe zostały zaktualizowane");
            System.out.println("ZUS, US oraz Chrześcijański Zbór Świadków Jehowy zostali poinformowani o zmianie wysokości wypłaty, płacz i płać!");
        }
        else{
            System.out.println("Pensja nie może być ujemna Panie Januszu!");
        }

    }
}