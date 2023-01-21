package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetiniz giriniz \n K: Kadin, E : Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("tamsayi olarak yasini gir");
        int yas = scan.nextInt();

        if((cinsiyet =='k' || cinsiyet =='K') && yas >=60 && yas<80) {
            System.out.println("emekli olabilirsin");
        } else if ((cinsiyet=='k' || cinsiyet=='K') && yas>=18&& yas<80 ) {
            System.out.println("emekli olmak icin" + (60-yas) + " yil daha calişmalisin");


        } else if ((cinsiyet=='e' || cinsiyet=='E') && yas>=65 && yas<80) {
            System.out.println("emekli olabilirsin");

        } else if ((cinsiyet == 'e' || cinsiyet=='E') && yas>=18&& yas<80 ) {
            System.out.println("emekli olmak icin" + (65-yas)+ "yil daha calis");


        }else {
            System.out.println("gecersiz bilgi");
        }

    }
}
