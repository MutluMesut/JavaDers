package day02_VariableScanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi girin");
        String girilenIsim = scan.nextLine();

        System.out.println("lütfen soyisminizi girin");
        String girilenSoyisim = scan.nextLine();
        System.out.println("lütfen yasınızı girin");
        int girilenYas = scan.nextInt();
        System.out.println("isminiz: "+girilenIsim+ "\nsoyisminiz: "+ girilenSoyisim+
                            "\nyasiniz" + girilenYas+
                             "\nkaydiniz tamamlanmistir");

    }

}
