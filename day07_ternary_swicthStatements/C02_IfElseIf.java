package day07_ternary_swicthStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan tamsayi al
        //sayi negatif ise "negatif sayi"
        //sayi rakam ise "girilen sayi rakam"
        //sayi 2 basamakli sayi ise "girilen sayi 2 basamakli"
        //sayi 2 basamaktan buyukse "buyuk sayi" yazdir


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 0) System.out.println("negatif sayi");
        else if (sayi > 0 && sayi <= 9) {
            System.out.println("girilen sayi rakam");

        } else if (sayi >= 100) {
            System.out.println("buyuk sayi");

        }else {
            System.out.println("gecersiz sayi");
        }
    }}
