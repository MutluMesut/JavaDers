package day06_IfElseStatements;

import java.util.Scanner;

public class C09_nestedIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyet giriniz:+ \n K:Kadin, E: Erken");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen yas giriniz");
        int yas = scan.nextInt();

        if (cinsiyet=='K' || cinsiyet == 'k'){
            if (yas>=60){
                System.out.println("emekli olabilirsin");
            } else if (yas>80 && yas<18) {
                System.out.println("gecersiz yas");

            } else if (yas<60) {
                System.out.println("emekli olmak icin "+ (60-yas)+ " yil daha calismalisin");

            }else {
                System.out.println("hatali giris");
            }


        } else if (cinsiyet=='E' || cinsiyet=='e') {
            if (yas>=65){
                System.out.println("emekli olabilirsin");
            } else if (yas<65) {
                System.out.println("emekli olmak icin " +(65-yas)+ " yil daha calismalisin");

            } else if (yas>80 || yas<18) {
                System.out.println("bu yasta olmaz");

            }


        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}
