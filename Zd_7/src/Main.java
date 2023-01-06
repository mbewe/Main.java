
import java.sql.SQLOutput;
import devices.Car;
import devices.Phone;


public class Main {
    public static void main(String[] args) {

    /*    Human me = new Human();
        me.firstName = "Kacper";

        //Zadanie 6. Punkty(1-3)

        Car auto1 = new Car("Mazda","6");
        Car auto2 = new Car("Mazda","6");

        System.out.println(auto1.equals(auto2));
        System.out.println(auto1 == auto2);
        System.out.println(auto1);
        System.out.println(auto2);

        //Zadanie 6. Punkty(4-5)

        Human you = new Human();
        you.firstName = "Wojciech";
        you.lastName = "Jabłoński";

        Car auto3 = new Car("Audi","3");

        Animal dzdzownica = new Animal("worm");
        dzdzownica.name = "Bożena";

        Phone komorka = new Phone("Nokia", 456123789);

        System.out.println(you);
        System.out.println(auto3);
        System.out.println(dzdzownica);
        System.out.println(komorka);
    }

     */
        Car bryka = new Car("TOYOTA", "YARIS");
        bryka.yearOfProduction= 1995;

        Phone służbowy = new Phone("MOTOROLA", 533788911);
        służbowy.yearOfProduction = 2001;

        bryka.turnOn();
        System.out.println(bryka.toString());
        bryka.turnOn();
        System.out.println(bryka.toString());
        bryka.turnOff();
        System.out.println(bryka.toString());

        służbowy.turnOff();
        System.out.println(służbowy.toString());
        służbowy.turnOn();
        System.out.println(służbowy.toString());
        służbowy.turnOn();
        System.out.println(służbowy.toString());

    }
}