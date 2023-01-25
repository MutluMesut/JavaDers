package day09_StringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // kullanicidan cumle al "cok" ile baslayan ilk kelimeyi yazdir
        // cumlede cok kelimesi yoksa " cok kelimesi yok" yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle yaziniz");
        String girilenCumle = scan.nextLine();

        if (!girilenCumle.contains("cok")){
            System.out.println("cok kelimesi yok");
        }else{

            int cokEndexi = girilenCumle.indexOf("cok");
            int boslukEndexi = girilenCumle.indexOf(" ",cokEndexi+1);

            System.out.println(girilenCumle.substring(cokEndexi, boslukEndexi));

        }



    }
}
