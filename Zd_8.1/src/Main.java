
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


        Animal dzdzownica = new Animal("worm");
        dzdzownica.name = "Bożena";

        Car bryka = new Car("TOYOTA", "YARIS");
        bryka.yearOfProduction= 1995;

        Phone służbowy = new Phone("MOTOROLA", 533788911);
        służbowy.yearOfProduction = 2001;

        Phone phone1 = new Phone("Nokia", 792585385);
        phone1.yearOfProduction = 2000;

        me.pet = dzdzownica;

        System.out.println(me.pet);
        System.out.println(you.pet);

        dzdzownica.sell(me, you, 1.0);

        System.out.println(me.pet);
        System.out.println(you.pet);

        me.tel = służbowy;

        System.out.println(me.tel);
        System.out.println(you.tel);

        phone1.sell(me, you, 1.0);

        System.out.println(me.tel);
        System.out.println(you.tel);

        me.auto = bryka;

        System.out.println(me.auto);
        System.out.println(you.auto);

        bryka.sell(me, you, 1.0);

        System.out.println(me.auto);
        System.out.println(you.auto);
        me.sell(me, you, 1.0);
    }
}