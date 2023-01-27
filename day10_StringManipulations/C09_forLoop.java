package day10_StringManipulations;

import java.util.Scanner;

public class C09_forLoop {
    public static void main(String[] args) {

        //kullanicidan bas ve bitis degerleri al(bas ve son dahil)
        // bu sayilar arasinda 5 in kati olan sayilari yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degerini giriniz");
        int baslangıc = scan.nextInt();

        System.out.println("Bitis degerini gir");
        int bitis = scan.nextInt();

        for (int i = baslangıc; i <=bitis ; i++) {
            if (i%5==0){
                System.out.print(i+ " ");
            }

        }

    }
}
