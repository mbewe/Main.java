package devices;
public class Phone extends Device {
    int telNumber;

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }
}
