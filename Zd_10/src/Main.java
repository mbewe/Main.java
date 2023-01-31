
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

        LPG bryka = new LPG("TOYOTA", "YARIS");
        bryka.yearOfProduction= 1995;

        me.auto = bryka;

        Phone służbowy = new Phone("MOTOROLA", 533788911);
        służbowy.yearOfProduction = 2001;

        Phone phone1 = new Phone("Nokia", 792585385);
        phone1.yearOfProduction = 2000;

        phone1.instalAnnApp("Facebook");
        phone1.instalAnnApp("Instagram", "2.01");

        bryka.refuel();
        bryka.sell(me,you,5000.0);
    }
}