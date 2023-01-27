package day11_forLoop;

import java.util.Scanner;

public class T_AsalSayi {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi isteyin ve bunun asal olup olmadigini kontrol edin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz ");
        int pozitifSayi = scan.nextInt();
        String sonuc = "sayi asal haaa";

        for (int i = 2; i <pozitifSayi ; i++) { // en kucuk asal sayi 2 olduğu için 2 de n basladik

            if (pozitifSayi%i==0){   //pozitif sayinin herhangi bir tam böleni var ise devamina bakmaya gerek yok
                                    // sayinin asal olmadığını anlamış oluruz bu nedenle break kullandik
                sonuc= "asal sayi degil";
                break;


                                   // else kullanmamamızın nedenini örnek ile acıklayalim: kullanicinın girdigi sayi
                                   // 35 olsun bu syinini 3 bölunmemesi veya 4 e bolunmamasi onu asal yapmaz
                                   // else yazilirsa, dongunun calismasi kadar bize else blogunda yazilanın cıktısini verir
                                   // or: kullnaici 7 girerse 6 kez else blogunda yazilanın cıktısini

            }


        }
        System.out.println(sonuc);
    }
}
