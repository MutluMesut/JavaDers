package day04_Increment_Concatenation.day11_forLoops;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        // kullanicidan bas ve son degeri olan pozitif sayilari al
        // sinirlar dahil olmak üzre aralarindaki  tum sayilari toplami yazdir
        // bitis degerei baslangıc degerinden kucukse uyari yzdirip islemi bitir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc ve bitis olmak uzere 2 pozitif sayi giriniz");

        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();

        if (bitis<baslangic){
            System.out.println("baslangic degeri kucuk olmali");
        }else {
            int toplam =0;
            for (int i = baslangic; i <bitis ; i++) {
                toplam+= i;

            }
            System.out.println(baslangic + " ile"+ bitis+" arasindaki degerler toplami: "+toplam);
        }
    }
}
