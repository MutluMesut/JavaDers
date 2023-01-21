package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println("Girilen harf buyuk");

        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }


    }
}
