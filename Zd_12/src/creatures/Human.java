package creatures;

import java.util.*;
import java.util.Comparator;

import devices.*;


public class Human implements Salleable {
    public final static Integer DEFAULD_GARAGE_SIZE = 3;
    public String firstName;
    public String lastName;
    public Animal pet;
    private final Car[] garage;
    public Phone tel;
    String checkedProducer, checkedModel, checkedType;
    Double checkedValue;
    public Double cash = 100.0;
    String dataSalary;
    Double valueSalary;
    String listItem;
    Integer parkingNumber;

    public List<String> historyList = new ArrayList<String>();

    public Human() {
        this.garage = new Car[DEFAULD_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        this.garage = new Car[garageSize];
    }

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
            Double salary = valueSalary;
            System.out.println("Dane księgowe zostały zaktualizowane");
            System.out.println("ZUS, US oraz Chrześcijański Zbór Świadków Jehowy zostali poinformowani o zmianie wysokości wypłaty, płacz i płać!");
            listItem = this.dataSalary + " - " + salary;
            historyList.add(listItem);
            this.cash += valueSalary;
        } else {
            System.out.println("Pensja nie może być ujemna Panie Januszu!");
        }

    }

    public Car getCar(Integer parkingNumber) {
        if (parkingNumber >= garage.length) {
            System.out.println("Garaż za mały");
            return null;
        } else if (parkingNumber < 0) {
            System.out.println("Ujemne miejsca ? weż tabletki");
            return null;
        } else if (this.garage[parkingNumber] == null) {
            return null;

        } else {
            return this.garage[parkingNumber];
        }
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
        checkedValue = input4.nextDouble();

        Scanner input5 = new Scanner((System.in));
        System.out.println("Który to rocznik ?");
        int checkedYearOfProduction = input5.nextInt();

        Scanner input6 = new Scanner((System.in));
        System.out.println("Podaj typ zasilania pojazdu (LPG/Diesel/Electric)");
        checkedType = input6.nextLine();

        Scanner input7 = new Scanner((System.in));
        System.out.println("Podaj miejsce parkingowe ( 0 - " + (this.garage.length - 1) + " )");
        parkingNumber = input7.nextInt();

        if (0 <= parkingNumber && parkingNumber <= this.garage.length) {

            if (checkedValue < valueSalary) {
                System.out.println("Ty bogolu, udało Ci sie kupić to auto za gotówkę");
                System.out.println(checkedType);
                switch (checkedType) {
                    case "LPG": {
                        Car pussyMagnet = new LPG(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    case "Diesel": {
                        Car pussyMagnet = new Diesel(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    case "Electric": {
                        Car pussyMagnet = new Electric(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    default:
                        System.out.println("Chłopie co ty lejesz do tego baku?");
                        break;
                }
            } else if (checkedValue / 12 <= valueSalary) {
                switch (checkedType) {
                    case "LPG": {
                        Car pussyMagnet = new LPG(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    case "Diesel": {
                        Car pussyMagnet = new Diesel(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    case "Electric": {
                        Car pussyMagnet = new Electric(checkedProducer, checkedModel, checkedValue, checkedYearOfProduction);
                        this.garage[parkingNumber] = pussyMagnet;
                        break;
                    }
                    default:
                        System.out.println("Chłopie co ty lejesz do tego baku?");
                        break;
                }
            } else {
                System.out.println("Z czym do ludzi, zapisz się na jakies studia i poszukaj nowej roboty");
            }
        } else {
            System.out.println("Nie ma takiego miejsca w tym garażu");
        }
    }
    public void setCar(Car car, int index) {
        this.garage[index] = car;

    }
    public void valueOfCars() {

        Double sum = 0.0;
        for (Car car : garage) {
            if (car == null) {
                continue;
            }
            sum += car.value;

        }
        System.out.println("Wartość aut  w garażu wynosi " + sum);
    }

    public void sortGarageByYearOfProd() {
        Arrays.sort(this.garage, Comparator.nullsFirst(Comparator.comparingInt(Car::getYearOfProduction)));
        System.out.println("Samochody poustawiane są rocznikami produkcji");

    }

    public boolean hasACar(Car car) {
        Boolean hasACar = false;

        for (Integer i = 0; i < this.garage.length; i++) {
            if (car.equals(this.garage[i])) {
                hasACar = true;
            }
        }
        return hasACar;
    }

    public boolean spaceChecker() {
        Boolean haveFreeSpace = false;

        for (Integer i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                haveFreeSpace = true;
            }
        }
        return haveFreeSpace;
    }

    public boolean moneyChecker(Double price) {
        Boolean hasMoney = true;
        if (price > this.cash) {
            hasMoney = false;
        }
        return hasMoney;
    }

    public void removeCar(Car car) {
        for (Integer i = 0; i < this.garage.length; i++) {
            if (car.equals(this.garage[i])) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (Integer i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                return;
            }
        }
    }

    public void addMoney(Double price) {
        this.cash += price;
    }

    public void collectMoney(Double price) {
        this.cash -= price;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Ludzie nie są na sprzedaż !!!");
    }

    public String toString() {
        return  this.firstName;
    }
}

