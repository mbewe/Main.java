import creatures.Human;
import devices.*;


public class Main {
    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";

        Human you = new Human();
        you.firstName = "Wojciech";
        you.lastName = "Jabłoński";

        me.cash += 1000000;
        LPG car1 = new LPG("KIA", "CEED", 5000.0, 2005);
        Diesel car2  = new Diesel("Mercedes", "Vito", 7500.0,  2002);
        Electric car3 = new Electric("Tesla", "3", 10000.0, 2015);

        me.setCar(car1,0);
        me.setCar(car2,1);
        me.setCar(car3, 2);


        you.cash = 5000.0;

        me.getCar(0).sell(me,you,1000.0);

        car1.ownerChecker(me);
        System.out.println(car1.curentOwner);
        System.out.println(car2.curentOwner);

    }
}