package day16_Array;

import java.util.Arrays;

public class tekrr {


    public static void main(String[] args) {
        // Bir marketin fiyatlarini tutan bir array var
        // Bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun

        double[] fiyatlar = {23, 34.5, 42.1, 5.7, 13.4, 23.5};
        enDusukEnyuksekFiyatlar(fiyatlar);

    }

    public static void enDusukEnyuksekFiyatlar(double[] fiyatlar) {
        double enDusuk = fiyatlar[0];
        double enYuksek = fiyatlar[0];
        for (int i = 0; i < fiyatlar.length; i++) {
            if (fiyatlar[i] < enDusuk) {
                enDusuk = fiyatlar[i];
            }
            if (fiyatlar[i] > enYuksek) {
                enYuksek = fiyatlar[i];
            }

        }

        System.out.println("en dusuk fiyat: " + enDusuk);
        System.out.println("en yuksek fiyat: " + enYuksek);

        System.out.println();


        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {2, 3, 4, 2, 5, 2, 6, 7, 4, 5, 1, 2, 4, 6, 3, 1, 9};
        int arananSayi = 2;
        elemanBul(arr,2);

    }

    public static void elemanBul(int[] arr, int arananSayi) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;


            }

        }
        if (sayac==0){
            System.out.println("aranan sayi array de yok");
        }else{
            System.out.println("aranan sayi "+arananSayi+" array de "+sayac+" adet kullanilmis");
        }



    }
}