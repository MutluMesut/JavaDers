package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C05_dataCasting {
    public static void main(String[] args) {
       // kullaicidan bir tamsayi al
        // double sayiyı ikinci sayiya bolun
        // ve bolum islemlerinin sonucunun tamsayi kismini yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        double sayi2 = scan.nextDouble();
        int sayi1 = scan.nextInt();
        System.out.println("Bolme islemi sonucu:" + (int)(sayi2/sayi1 ));



    }
}
