package devices;


public class LPG extends Car {
    int batteryPower = 1;

    public LPG(String producer, String model) {
        super(producer, model);
    }


    @Override
    public void refuel() {
            System.out.println("Pojedz na stacje");
            System.out.println("Podjedz pod dystrybutor");
            System.out.println("Wyjmij korek wstydu i przykręć");
            System.out.println("Jak to było z tym zaciskiem?");
            System.out.println("No i pełen bak");
            System.out.println("O cho, jeszcze na hotdoga starczy");

    }
}
