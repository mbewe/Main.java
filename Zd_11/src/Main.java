
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
        
        me.setSalary();
        me.setCar();


    }
}