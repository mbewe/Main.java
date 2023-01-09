
import java.sql.SQLOutput;
import devices.*;
import creatures.*;


public class Main {
    public static void main(String[] args) {

        Human me = new Human("kacper");



        Human you = new Human("Wojciech");

        you.lastName = "Jabłoński";

        Car bryka = new Car("TOYOTA", "YARIS");
        bryka.yearOfProduction= 1995;

        Phone służbowy = new Phone("MOTOROLA", 533788911);
        służbowy.yearOfProduction = 2001;

        Animal dog = new Animal("canis");

        me.pet = dog;

        you.setSalary();

        me.tel = służbowy;
        //dog.sell(me, you, 50.0);
        //służbowy.sell(me, you, 10.0);




    }
}