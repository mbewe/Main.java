import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;


public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog");

        dog.name = "Szarik";
        dog.isAlive = true;

        Human me = new Human();
        Human human =new Human();

        me.firstName = "Damian";
        me.pet = dog;


        Car car1 = new Car("Peugeot","307",25000.00,1900);
        Car car2 = new Car("Renault","Scenic",5000.00,1990);



        Phone phone = new Phone("Samsung","A51",1990);

        me.phone = phone;



        human.setSalary();



        System.out.println(me.pet);
        System.out.println("--------------");
        System.out.println(human.pet);
        System.out.println("--------------");

        dog.sell(me, human, 50.0);

        System.out.println(me.pet);
        System.out.println("asdasdsasa");
        System.out.println(human.pet);
        System.out.println("asdasdsasa");

        human.setSalary();

        System.out.println(me.phone);
        System.out.println("asdasdsasa");
        System.out.println(human.phone);

        phone.sell(me, human, 50.0);

        System.out.println("++++++++++++++");

        System.out.println(me.phone);
        System.out.println("asdasdsasa");
        System.out.println(human.phone);

        human.sell(me, human, 50.0);

        human.getSalary();
        me.getSalary();








    }
}