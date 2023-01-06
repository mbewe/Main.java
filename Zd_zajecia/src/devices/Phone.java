package devices;

public class Phone extends Device{

        int telNumber;

        public Phone(String producer, String model, int yearOfProduction, int telNumber)
        {
            super(producer, model, yearOfProduction);
            this.telNumber = telNumber;
        }
        // Zadanie 6. Punkty(4-5)
        public String toString() {
            return "Producer: " + this.producer + " " + "Number: " + this.telNumber;
        }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowano");

    }
}


