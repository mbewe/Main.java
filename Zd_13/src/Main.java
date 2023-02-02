import creatures.Human;
import devices.*;


public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";

        Human you = new Human();
        you.firstName = "Wojciech";
        you.lastName = "Jabłoński";
        me.cash = 1000.0;

        Phone phone1 = new Phone("motorola", 123456789);
        me.tel =phone1;
        phone1.installApp(me,"Fb", 1.0, "1.03");
        phone1.installApp(me,"Instagram", 8.0, "1.06");
        phone1.installApp(me,"Janosik", 0.0, "1.03");
        System.out.println(me.cash);
        phone1.installApp(me,"Signal", 7.0, "1.03");
        phone1.installApp(me,"Chrome", 2.5, "1.03");
        phone1.installApp(me,"Gmail", 100.0, "1.03");
        phone1.installApp(me,"Hacker Typer", 80.0, "1.03");
        phone1.installApp(me,"Fb", 1.0, "1.03");

    phone1.freeApp();



    phone1.valuesOfApps();
    phone1.allAppsNames();
    phone1.allAppsPrice();




    }
}