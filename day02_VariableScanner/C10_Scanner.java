package day02_VariableScanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi1= scan.nextInt();

        System.out.println("Lütfen bir ondalikli sayi giriniz");
        double girilenSayi2 = scan.nextDouble();
        System.out.println("sayilarin toplami:"+(girilenSayi2+girilenSayi1)+
                          "\nsayilarin carpimi:"+girilenSayi1*girilenSayi2);


    }
}
