package day02_VariableScanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullacidan bir sayi iste ve sayinin karesini yzdr

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double girilenSayi = scan.nextDouble();
        System.out.println("girilen sayinin karesi: " +girilenSayi*girilenSayi);

    }
}
