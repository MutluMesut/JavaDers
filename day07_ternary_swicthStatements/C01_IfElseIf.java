package day07_ternary_swicthStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan tamsayi al
        //sayi rakam ise "girilen sayi rakam"
        //sayi 2 basamakli sayi ise "girilen sayi 2 basamakli"
        //sayi 2 basamaktan buyukse "buyuk sayi" yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>=10 && sayi<=99){
            System.out.println("girilen sayi 2 basamakli ");
        } else if (sayi>=0 && sayi<=9) {
            System.out.println("girilen sayi rakam");
        } else if (sayi>99) {
            System.out.println("buyuk sayi");
        }else {
            System.out.println("gecersiz sayi");
        }
    }

}
