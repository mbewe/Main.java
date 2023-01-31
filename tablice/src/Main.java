public class Main {
    public static void main(String[] args) {


//         int [] tablica = new int[10];
//
//         for(int i = 0; i<10; i++)
//             tablica[i] = i + 101;
//
//         for(int i = 0; i< 10; i++)
//            System.out.println(tablica[i]);

//        int [] tablica = new int[10];
//
//         for(int i = 0; i<10; i++)
//             tablica[i] = (i + 1)*10;
//
//         for(int i = 0; i< 10; i++)
//            System.out.println(tablica[i]);

//        boolean [] tablica = new boolean[20];
//
//        for(int i = 0; i<20; i++)
//            if(i % 2 == 0){
//             tablica[i] = true;
//            }
//            else {
//                tablica[i] = false;
//            }
//        for(int i = 0; i< 20; i++)
//            System.out.println(tablica[i]);

        int [] tablica = new int[100];

         for(int i = 0; i<100; i++)
             tablica[i] = i%10;

         for(int i = 0; i< 100; i++)
            System.out.println(tablica[i]);
    }
}