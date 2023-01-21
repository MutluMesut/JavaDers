package day06_IfElseStatements;

import java.util.Scanner;

public class C10_nestedElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();

        System.out.println("Kullanici kartiniz var mi? \n E: Evet, H :Hayır");
        char kartVarmi = scan.next().charAt(0);

        if (urunAdedi>10){
            if (kartVarmi=='e'|| kartVarmi=='E'){
                System.out.println("%20 indirim: " +urunAdedi*listeFiyati*0.8);
            } else if (kartVarmi=='h'||kartVarmi=='H') {
                System.out.println("%15 indirim :"+ urunAdedi*listeFiyati*0.85);
            }else{
                System.out.println("hatali kart bilgisi");
            }


        } else if (urunAdedi>0) {
            if (kartVarmi=='e'|| kartVarmi=='E'){
                System.out.println("%20 indirim: " +urunAdedi*listeFiyati*0.8);
            } else if (kartVarmi=='h'||kartVarmi=='H') {
                System.out.println("%15 indirim :"+ urunAdedi*listeFiyati*0.85);
            }else{
                System.out.println("hatali kart bilgisi");
            }


        }else{
            System.out.println("gecersiz urun adedi");
        }

    }
}
