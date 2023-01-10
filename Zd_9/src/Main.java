
import java.sql.SQLOutput;
import devices.*;
import creatures.*;



public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";

        Human you = new Human();
        you.firstName = "Wojciech";
        you.lastName = "Jabłoński";

        Car bryka = new Car("TOYOTA", "YARIS");
        bryka.yearOfProduction= 1995;

        Phone służbowy = new Phone("MOTOROLA", 533788911);
        służbowy.yearOfProduction = 2001;

        Phone phone1 = new Phone("Nokia", 792585385);
        phone1.yearOfProduction = 2000;

        FarmAnimal dzdzownica = new FarmAnimal("worm");
        dzdzownica.beEaten();
        dzdzownica.feed();
        dzdzownica.feed(0.2);
        dzdzownica.takeForAWalk();

    }
}