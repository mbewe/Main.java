
import java.sql.SQLOutput;
import devices.Car;
import devices.Phone;


public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";


        Human you = new Human();
        you.firstName = "Wojciech";
        you.lastName = "Jabłoński";



        Animal dzdzownica = new Animal("worm");
        dzdzownica.name = "Bożena";

        Phone komorka = new Phone("Nokia", 456123789);

        you.pet = dzdzownica;
        System.out.println(me.pet);
        me.setSalary();
        you.sell(you, me, 100.00);
        System.out.println(me.pet);



    }
}