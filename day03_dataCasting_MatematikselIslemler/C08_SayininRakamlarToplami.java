package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplami {
    public static void main(String[] args) {
        // kullanicidan 4 basamakli bir pozitif sayi al
        // sayinin rakamlarini topla

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli bir tamsayi giriniz");
        int sayi1 = scan.nextInt(); //2457

        int birlerBasamagi = 0;
        int rakamlarToplami =0;

        birlerBasamagi= sayi1%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi1= sayi1/10; //245

        birlerBasamagi =sayi1%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi1= sayi1/10;//24

        birlerBasamagi =sayi1%10;//4
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi1= sayi1/10;//2

        birlerBasamagi =sayi1%10;//4
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi1= sayi1/10;//0

        System.out.println("girilen sayinin rakamlar toplami: " + rakamlarToplami);






    }
}
