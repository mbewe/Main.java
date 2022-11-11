package blokPierwszy;
public class Phone {
    String producer;
    int telNumber;

    Phone(String producer, int telNumber)
    {
        this.producer = producer;
        this.telNumber = telNumber;
    }
    // Zadanie 6. Punkty(4-5)
    public String toString() {
        return "Producer: " + this.producer + " " + "Number: " + this.telNumber;
    }
}
