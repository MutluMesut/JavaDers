package day02_VariableScanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /* kullacidan iki sayi al ve ikisinin dgerlerini degistir
            kullanicinin girdigi degreler
            sayi1= 10 sayi2= 20 ise
            sonuc olarak
            sayi1=20 sayi2=10 olsun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayi1 i giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lütfen sayi1 i giriniz");
        int sayi2 = scan.nextInt();
        int temp ;

        temp = sayi2;
        sayi2= sayi1;
        sayi1 =temp;
        System.out.println("sayilarin yerleri degisir: "+ "\nsayi1 in yeni degeri"+
        +sayi1+
       "\nsayi2 in yeni degeri"+ sayi2 );


    }


}
