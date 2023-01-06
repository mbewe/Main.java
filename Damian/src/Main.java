import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();


        System.out.println("\nChoose Your action.\n" +
                "Enter '1' to start count");
        int menuChoose = scanner1.nextInt();

        switch (menuChoose) {
            case 1: {
                System.out.println("Day has ended.\n");
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    int secondsCounter = 10;

                    @Override
                    public synchronized void run() {
                         if (secondsCounter > 0) {
                            System.out.println(secondsCounter + " Seconds to new day." + Thread.currentThread().getId());
                            secondsCounter--;
                        } else {
                            System.out.println("New day!");
                            timer.cancel();
                        }
                    }
                };

                timer.scheduleAtFixedRate(task, 0, 1000);

                int robbery = random.nextInt(100) + 1;

                if (robbery <= 10) //10% to get robbed
                {
                    System.out.println("\nROBBERY! JAROSŁAW K. HAS STEAL YOUR MONEY!\n");
                }
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa" + Thread.currentThread().getId());
            }
            break;
        }
    }
}