package day02_VariableScanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kenar uzunluklarini yazin");
        double kenaruzunlugu1 = scan.nextDouble();
        double kenaruzunlugu2 = scan.nextDouble();
        System.out.println("dikdörtgenin alanı:"+ kenaruzunlugu2*kenaruzunlugu1);
    }
}
