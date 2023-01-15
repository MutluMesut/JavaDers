package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_charDataCasting {
    public static void main(String[] args) {

        System.out.println('a'+'b');//195

        System.out.println('a'-32);//97-32=65
        //'a'-32 nin char olarak sonucunu yazdir

        System.out.println((char)('a'-32)); //A

        // kullanicidan char al
        //ascii table dan kullanicinin girdigi char in sonrasinkai
        // 3 karakteri yazdirin
        // örnek: input: a output : b,c,d

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        System.out.println((char) (girilenKarakter+1) + " , " +
                           (char) (girilenKarakter+2) + " , " +
                           (char) (girilenKarakter+3));


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        char krk1= '$';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        System.out.println(Character.isAlphabetic(krk1));

        short sayi3 = 4;
        int sayi5=sayi3;

        Short sayi6= 45;
      //  Integer sayi7 = (Integer) sayi6;





    }
}
