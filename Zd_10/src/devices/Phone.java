package devices;

import creatures.Human;
import java.util.List;

public class Phone extends Device {
    int telNumber;
    private static final String INITIAL_VERSION = "initial version";
    private static final String INITIAL_SERVERIP = "192.168.1.1";

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {

        if (seller.tel.producer == this.producer && seller.tel.telNumber == this.telNumber) {
            if (price <= buyer.cash) {
                buyer.tel = seller.tel;
                seller.tel = null;
            } else {
                System.out.println("Kupującego nie stać!");
            }
        } else {
            System.out.println("Sprzedawca nie ma tego na sprzedaż!");
        }
    }

    public void instalAnnApp(String appName) {
        this.instalAnnApp(appName, INITIAL_VERSION);
    }

    public void instalAnnApp(String appName, String version) {
        this.instalAnnApp(appName, version, INITIAL_SERVERIP);
    }

    public void instalAnnApp(String appName, String version, String server) {
        System.out.println("Próba instalacji aplikacji" + appName + " w wersji: " + version + "z serwera" + server);
        System.out.println("Sprawdzanie płatności");
        System.out.println("Sprawdzanie miejsca na dysku...");
        System.out.println("Pobieranie aplikacji...");
        System.out.println("Instalowanie aplikacji...");
        System.out.println("Zainstalowano");

    }

    public void instalAnnApp(List<String> appsToInstallList) {
        for (String appName : appsToInstallList) {
            this.instalAnnApp(appName);
        }
    }
}
