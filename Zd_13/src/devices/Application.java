package devices;

public class Application implements Comparable<Application>{
    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nNazwa aplikacji: " + this.name + "\nWersja: " + this.version + "\nCena: " + this.price;
    }

    @Override
    public int compareTo(Application app) {
        if (this.price < app.price)
            return -1;
        if (this.price > app.price)
            return 1;
        else return 0;
    }
}