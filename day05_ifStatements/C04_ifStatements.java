package day05_ifStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%3==0){
            System.out.println("3 ile bolunebilenn sayi");
        }
        if (sayi%5==0){
            System.out.println("5 ile bolunebilen sayi");
        }
    }
}
