public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";

        Car szybki = new Car("Mazda", "6");
        szybki.color = "czarny";

        me.auto = szybki;
        System.out.println(me.firstName+", Twoje auto to:");
        System.out.println(me.auto.producer+" "+me.auto.model+" "+me.auto.color);

    }
}