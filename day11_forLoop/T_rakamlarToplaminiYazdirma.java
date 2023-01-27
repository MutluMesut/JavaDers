package day11_forLoop;

import java.util.Scanner;

public class T_rakamlarToplaminiYazdirma {
    //kullancidan pozitif tamsayi alıp rakmalar toplamini yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

       int toplam=0;
       if (sayi<=0){
           System.out.println("Gecersiz sayi");
       }else {
           for (int i = 1; i<=sayi ; i++) {
               toplam+=sayi%10;
               sayi=sayi/10;

           }
       }
        System.out.println("sayilarin toplami: "+toplam);



    }
}
