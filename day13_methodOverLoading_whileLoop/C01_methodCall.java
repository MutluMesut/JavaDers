package day13_methodOverLoading_whileLoop;

import day12_MethodCretion.C03_AsalSayi;
import day12_MethodCretion.C07_TerseCevirme;
import day12_MethodCretion.C09_fibonacciSerisi;

public class C01_methodCall {
    public static void main(String[] args) {
        C09_fibonacciSerisi.fibonaccidenSayiYazdir(14);

        //asagidaki cumleyi terse cevir ve yazdir
        String str = "Bir kere yaparim yan gelir yatarim";

        System.out.println(C07_TerseCevirme.metniTerseCevir(str));

        // asalsayi mi

        int sayi = 23;
        C03_AsalSayi.asalSayiMi(sayi);
        boolean sonuc = C03_AsalSayi.asalSayiMi(sayi);

        if (sonuc){
            System.out.println("girilen"+ sayi+ "asal");
        }else {
            System.out.println("girilen"+ sayi+ "asal degil");
        }






    }
}
