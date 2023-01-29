
import java.sql.SQLOutput;
import devices.Car;
import devices.Phone;


public class Main {
    public static void main(String[] args) {


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