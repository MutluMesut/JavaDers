package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();

        System.out.println("Kullanici kartiniz var mi? \n E: Evet, H :Hayır");
        char kartVarmi = scan.next().charAt(0);

        if (kartVarmi == 'e' || kartVarmi=='E'){
            if (urunAdedi<=0) System.out.println("gecersiz urun miktari");
            else if (urunAdedi>10) {
                System.out.println("%20 indirim:" +urunAdedi*listeFiyati*0.8);
            }else{
                System.out.println("%15 indirim:"+ urunAdedi*listeFiyati*0.85);
            }


        } else if (kartVarmi=='h'||kartVarmi=='H') {
            if (urunAdedi<=0) System.out.println("gecersiz urun miktari");
            else if (urunAdedi>10) {
                System.out.println("%15 indirim:" +urunAdedi*listeFiyati*0.8);
            }else{
                System.out.println("%10 indirim:"+ urunAdedi*listeFiyati*0.85);
            }




        }else{
            System.out.println("kart bilgisi gecersiz");
        }


    }
}
