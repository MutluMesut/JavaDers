package day08_StringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String girilenGun = scan.next();
        String kullanilacakGun = girilenGun.toLowerCase();

        switch (kullanilacakGun){
            case  "pazartesi" :
                System.out.println(girilenGun+" 5 gun daha calısmalısın" );
                break;

            case  "sali" :
                System.out.println(girilenGun+" 4 gun daha calısmalısın" );
                break;
            case  "carsamba" :
                System.out.println(girilenGun+" 3 gun daha calısmalısın" );
                break;
            case  "persembe" :
                System.out.println(girilenGun+" 2 gun daha calısmalısın" );
                break;
            case  "cuma" :
                System.out.println(girilenGun+" 1 gun daha calısmalısın" );
                break;
            case  "cumartesi" :
                System.out.println(girilenGun+" simdi talil zamani" );
                break;
            case  "pazar" :
                System.out.println(girilenGun+" simdi talil zamani" );
                break;
        }


    }
}
