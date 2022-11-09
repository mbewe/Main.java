public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.isAlive = true;


        System.out.println(dog.name);

        Human me = new Human();
        me.firstName = "Kacper";
        me.pet = dog;
        System.out.println(me.pet.name);

        dog.takeForAWalk();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();


    }
}