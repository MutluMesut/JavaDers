package day10_StringManipulations;

public class C13_tekrar {
    public static void main(String[] args) {
        String str = "Evden calisiyorum, ofise gitmeye gerek yok";

        String kullanilacakStr = str.toLowerCase();
        if (kullanilacakStr.contains("is")&&kullanilacakStr.contains("home")) {
            System.out.println("hem ev hem is lazim");

        } else if (kullanilacakStr.contains("is")) {
            System.out.println("calismak guzeldir");

        } else if (kullanilacakStr.contains("ev")){
            System.out.println("home home sweet home");

        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
