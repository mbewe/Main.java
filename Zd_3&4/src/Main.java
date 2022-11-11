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

        Car szybki = new Car("Mazda", "6");
        szybki.color = "czarny";

        me.auto = szybki;
        System.out.println(me.firstName+", Twoje auto to:");
        System.out.println(me.auto.producer+" "+me.auto.model+" "+me.auto.color);
*/
        me.setSalary();
        me.getSalary();
        me.setSalary();
        me.getSalary();  }
}
