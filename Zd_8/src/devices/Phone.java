package devices;

import java.sql.SQLOutput;

public class Phone extends Device {
    int telNumber;

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }

    void instalAnnApp(String nameApp, String version, String serverIP) {
        System.out.println("Sprawdzanie miejsca na dysku...");
        System.out.println("Sprawdzenie dostępu...");
        System.out.println("Sprawdzenie płatności...");
        System.out.println("Pobieranie aplikacji...");
        System.out.println("Instalowanie aplikacji");
    }

    void instalAnnApp(String nameApp, String version) {
        this.instalAnnApp(nameApp, version, "192.1.1.567");
    }

    void instalAnnApp(String nameApp) {
        this.instalAnnApp(nameApp, "1.0");
    }
    public void instalAnnApp() {
        this.instalAnnApp("Unknown");
    }
}

