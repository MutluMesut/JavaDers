package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);//5
        System.out.println(29/3);//9
        //bölme isleminde 2 int isleme giriyorsa sonuc int olarak verei

        double dbl =2;
        int sayi1 = 25;
        System.out.println(sayi1/dbl);


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bölmek icin iki sayi giriniz");
        int ilkSayi= scan.nextInt();
        int ikinciSayi = scan.nextInt();

        System.out.println("iki sayinin bölme sonucu:"+ (double)ilkSayi/ikinciSayi);


    }
}
