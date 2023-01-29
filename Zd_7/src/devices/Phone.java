package devices;
public class Phone extends Device {
    int telNumber;

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }

    @Override
    public void turnOn() {
        if (this.mode == false) {
            this.mode = true;
            System.out.println("10%");
            System.out.println("30%");
            System.out.println("50%");
            System.out.println("70%");
            System.out.println("100%");
            System.out.println("Ekran powitalny");
        } else {
            System.out.println("Już jest włączone!!!");
        }
    }

    @Override
    public void turnOff(){
        if (this.mode == true) {
            this.mode = false;
            System.out.println("Ekran pożegnalny");
        } else {
            System.out.println("Już jest wyłączone!!!");
        }
    }
}
