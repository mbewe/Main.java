
import java.sql.SQLOutput;
import devices.Car;
import devices.Phone;


public class Main {
    public static void main(String[] args) {
/*
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.isAlive = true;


        System.out.println(dog.name);
*/
        Human me = new Human();
        me.firstName = "Kacper";
/*      me.pet = dog;
        System.out.println(me.pet.name);

        dog.takeForAWalk();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
/*
        Car szybki = new Car("Mazda", "6");
        szybki.color = "czarny";

        me.auto = szybki;
        System.out.println(me.firstName+", Twoje auto to:");
        System.out.println(me.auto.producer+" "+me.auto.model+" "+me.auto.color);

        me.setSalary();
        me.getSalary();
        me.setSalary();
        me.getSalary();

        me.setSalary();
        me.setCar();
        me.getCar();
*/
/*
        //Zadanie 6. Punkty(1-3)

        Car auto1 = new Car("Mazda","6");
        Car auto2 = new Car("Mazda","6");

        System.out.println(auto1.equals(auto2));
        System.out.println(auto1 == auto2);
        System.out.println(auto1);
        System.out.println(auto2);
*/
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
}
