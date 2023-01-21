package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //kullanicidan harf iste girilen karakter kucuk harf ise
        // buyuk harf olark yazdir
        //yoksa girilen harfi yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter<='a' && girilenKarakter<='z'){
            System.out.println(Character.toUpperCase(girilenKarakter));
            System.out.println((char)( girilenKarakter-32));
        }else {
            System.out.println(girilenKarakter);
        }
    }
}
