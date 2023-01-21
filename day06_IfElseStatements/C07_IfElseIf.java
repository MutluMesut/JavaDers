package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuzu kg olarak gir");
        double kilo = scan.nextDouble();

        System.out.println("cm olarak boyunu gir");
        double boy= scan.nextDouble();

        double vke = (kilo*10000) / (boy*boy);

        System.out.println("Vucut kitle endeksiniz:"+vke);
        
        if (vke>=30) System.out.println("Obezsiniz");
        else if (vke>=25 && vke<30 ) System.out.println("kilolusunuz");
        else if (vke>=20 && vke<25 ) System.out.println("normal");
        else if (vke<20) System.out.println("zayifsiniz");


    }
}
