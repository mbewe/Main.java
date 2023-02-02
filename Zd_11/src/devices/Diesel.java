package devices;


public class Diesel extends Car {


    public Diesel(String producer, String model, Double value, int yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }


    @Override
    public void refuel() {
        System.out.println("Pojedz na stacje");
        System.out.println("Podjedz pod dystrybutor");
        System.out.println("Wlew masz z drugiej strony, jeszcze raz");
        System.out.println("Łap za weża z czarna głową");
        System.out.println("Cena z litr Cię nie interesuje, zawsze lejesz za 50 zł");
        System.out.println("Coraz szybciej te dystrybutory pompują");


    }


}

