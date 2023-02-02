package devices;

import creatures.Human;

import java.util.*;

public class Phone extends Device {
    int telNumber;
    private static final String INITIAL_VERSION = "initial version";
    private static final String INITIAL_SERVERIP = "192.168.1.1";
    public List<Application> collectionOfApplications = new ArrayList<Application>();

    public Phone(String producer, int telNumber) {
        this.producer = producer;
        this.telNumber = telNumber;
    }

    public void installApp(Human human, String name1, Double price1, String version1) {
        Boolean appInstalled = false;
        for (int i = 0; i < this.collectionOfApplications.size(); i++) {
            if (name1.equals(this.collectionOfApplications.get(i).name)) {
                appInstalled = true;
            }
        }
        if (appInstalled == false) {

            if (price1 <= human.cash) {
                human.cash -= price1;
                Application app = new Application(name1, version1, price1);
                this.collectionOfApplications.add(app);
                System.out.println("Aplikacja: " + app + " została zainstalowana." + price1);
            }
        } else {
            System.out.println("Aplikacja jest już zainstalowana.");
        }
    }

    public void installedAppChecker(Application app) {
        Boolean appInstalled = false;
        for (int i = 0; i < this.collectionOfApplications.size(); i++) {
            if (app.equals(this.collectionOfApplications.get(i))) {
                appInstalled = true;
            }
        }
        if (appInstalled == true) {
            System.out.println("Aplikacja  zainstalowana.");
        } else {
            System.out.println("Aplikacja jest zainstalowana.");
        }
    }

    public void installedAppChecker(String appName) {
        Boolean appInstalled = false;
        for (int i = 0; i < this.collectionOfApplications.size(); i++) {
            if (appName.equals(this.collectionOfApplications.get(i).name)) {
                appInstalled = true;
            }
        }
        if (appInstalled == true) {
            System.out.println("Aplikacja jest zainstalowana.");
        } else {
            System.out.println("Aplikacja jest zainstalowana.");
        }
    }

    public void freeApp() {
        for (int i = 0; i < this.collectionOfApplications.size(); i++) {
            if (this.collectionOfApplications.get(i).price == 0.0) {
                System.out.println("Darmowa aplikacja - " + this.collectionOfApplications.get(i));
            }
        }
    }

    public Double valuesOfApps() {
        Double sum = 0.0;
        for (int i = 0; i < this.collectionOfApplications.size(); i++) {
            sum += this.collectionOfApplications.get(i).price;
        }
        return sum;
    }

    public void allAppsNames() {


        for (Application app : collectionOfApplications) {
            System.out.println(app.name);
        }
    }

    public void allAppsPrice() {
        Collections.sort(collectionOfApplications);


        for (Application app : collectionOfApplications) {
            System.out.println(app.price + " -  " + app.name);
        }
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
    public void turnOff() {
        if (this.mode == true) {
            this.mode = false;
            System.out.println("Ekran pożegnalny");
        } else {
            System.out.println("Już jest wyłączone!!!");
        }
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

//    public void instalAnnApp(String appName) {
//        this.instalAnnApp(appName, INITIAL_VERSION);
//    }
//
//    public void instalAnnApp(String appName, String version) {
//        this.instalAnnApp(appName, version, INITIAL_SERVERIP);
//    }
//
//    public void instalAnnApp(String appName, String version, String server) {
//        System.out.println("Próba instalacji aplikacji " + appName + " w wersji: " + version + " z serwera " + server);
//        System.out.println("Sprawdzanie płatności");
//        System.out.println("Sprawdzanie miejsca na dysku...");
//        System.out.println("Pobieranie aplikacji...");
//        System.out.println("Instalowanie aplikacji...");
//        System.out.println("Zainstalowano");
//
//    }
//
//    public void instalAnnApp(List<String> appsToInstallList) {
//        for (String appName : appsToInstallList) {
//            this.instalAnnApp(appName);
//        }
//    }
}
