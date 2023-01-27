package day10_StringManipulations;

public class C05_soru {
    public static void main(String[] args) {

        String str = "Evden calisiyorum, ofise gitmeye gerek yok";

        String calisilacakStr = str.toLowerCase();

        if (calisilacakStr.contains("ev")&&calisilacakStr.contains(" is")){
            System.out.println("hem ev lazim hem is");

        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home home sweet home");

        } else if (calisilacakStr.contains("is")) {
            System.out.println("calismak guzeldir");

        }else{
            System.out.println("cok calisman lazim");
        }

    }
}
