package day04_Increment_Concatenation.day11_forLoops;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {

        // kullanicidan bir char alıp o karakterden sonra gelen
        // 10 karakteri yazdir.

        Scanner scan = new Scanner(System.in);
        System.out.println( "Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(girilenKarakter+i) + " ");

        }
    }
}
