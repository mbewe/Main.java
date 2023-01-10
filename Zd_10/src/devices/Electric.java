package devices;


public class Electric extends Car {
    int batteryPower = 1;

    public Electric(String producer, String model) {
        super(producer, model);
    }


    @Override
    public void refuel() {
            System.out.println("Pojedz na stacje");
            System.out.println("Albo w domu do agregatu");
            System.out.println("Idz spać, trochę to potrwa");
            System.out.println("Jeszcze nieee");
            System.out.println("Jeszcze nieeeeee");
            System.out.println("Dobra dojedziesz do warzywniaka");

    }
}

