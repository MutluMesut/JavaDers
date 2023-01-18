package day05_ifStatements;

import java.util.Scanner;

public class C01_ifStatementns {
    public static void main(String[] args) {
        //kullanicidan notunu rakam olarak al harf olarak yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if(0<=not&&not<50){
            System.out.println("Notunuz DD maalesef kaldiniz");
        }
        if (50<=not&&not<65){
            System.out.println("Notunuz CC tebrikler gectiniz");
        }
        if (65<=not&&not<85){
            System.out.println("Notunuz BB");
        }
        if (85<=not&&not<=100){
            System.out.println("Tebrikler notunuz AA");
        }
    }
}
