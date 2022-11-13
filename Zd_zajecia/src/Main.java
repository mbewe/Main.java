public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";

        Car auto1 = new Car("Mazda","6",2008);
        Car auto2 = new Car("Mazda","6",2008);

        System.out.println(auto1);
        System.out.println(auto2);

        me.setSalary();
        me.setCar();
        me.getCar();
    }
}
