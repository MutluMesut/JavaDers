package day14_doWhileLoopScope;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int sayi= 0;
        int toplam = 0;

        Scanner scan= new Scanner(System.in);

        do {
            System.out.println("tam sayi gir");
            sayi= scan.nextInt();
            toplam+=sayi;


        }while (sayi!=0);
        System.out.println("girilen sayilarin toplami: "+ toplam);



    }
}
