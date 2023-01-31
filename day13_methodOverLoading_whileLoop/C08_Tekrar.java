package day13_methodOverLoading_whileLoop;

import day12_MethodCretion.C07_TerseCevirme;

import java.util.Scanner;

public class C08_Tekrar {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter" deyip toplami yazdirin
        // bu soruyu illa da for loop ile yapalim dersek
        // adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan = new Scanner(System.in);
        int sayi =0;
        int toplam =0;

        for (int i = 0; i < 10000; i++) {
            System.out.println("lutfen tamsayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            if (toplam>=500){
                System.out.println("bu kadar sayi yeter " +toplam);
                break;
            }

        }

    }

}


