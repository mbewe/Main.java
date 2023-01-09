
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

        Animal burek = new Animal("canis");

        me.pet = burek;

        you.setSalary();

        burek.sell(me,you,100.0);




    }
}