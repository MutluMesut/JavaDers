package day05_ifStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (0<sayi){
            System.out.println("pozitif sayi");
        }
        if (100<=sayi && sayi<=999){
            System.out.println("Pozitif 3 basamakli sayi");
        }
        if (sayi%3==0){
            System.out.println("3 un kati");
        }
        if (sayi%10==7){
            System.out.println("Mukemmel");
        }
    }
}
