package day05_ifStatements;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yazdirmak istediginiz ayin ilk harfini giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O') System.out.println("Ocak");
        if (ilkHarf == 's' || ilkHarf == 'S') System.out.println("Subat");
        if (ilkHarf == 'm' || ilkHarf == 'M') System.out.println("Mart veya Mayis");
        if (ilkHarf == 'n' || ilkHarf == 'N') System.out.println("Nisan");
        if (ilkHarf == 'h' || ilkHarf == 'H') System.out.println("haziran");
        if (ilkHarf == 't' || ilkHarf == 'T') System.out.println("Temmuz");
        if (ilkHarf == 'a' || ilkHarf == 'A') System.out.println("Agustos veya Aralik");
        if (ilkHarf == 'e' || ilkHarf == 'E') System.out.println("Eylul veya Ekim");
        if (ilkHarf =='k' || ilkHarf=='K')System.out.println("Kasim");


    }
}
