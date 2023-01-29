package day12_MethodCretion;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi ve istedigi islemi alin (+ / * -)
        // bir method olusturup sayilara istenen islemi uygulayip
        // sonucu bize dondurun.
        // kullanici islemi yanlis secmisse 0 dondurun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lutfen bir islem secin +, -, / , *");
        char islem=scan.next().charAt(0);// ============>  bu islemin yerine String islem= scan.next() de kullanilabilri


    }
    public static double hesapMakinasi(double sayi1, double sayi2, char islem){
        switch (islem){
            case '+' :
                return sayi1+sayi2;
            case '-' :
                return sayi1-sayi2;
            case '/' :
                return sayi1/sayi2;
            case '*' :
                return sayi1*sayi2;
            default  :
                return 0;
        }

        }
}
