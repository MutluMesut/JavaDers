package day02_VariableScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanicidan isim al ve girilen ismi buyuk hafrlae yazdır
        //1- Scanner objesi olustur
        //2- kullanaciya ne istedigini sorun
        //3-kullanicinin girecegi degeri kaydedecek bir variable olustur

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi yazin");
        String girilenIsim = scan.nextLine();
        //artik kullanicinin girdigi deger girilenin variable ında kayıtlı

        System.out.println(girilenIsim.toUpperCase());
    }
}
