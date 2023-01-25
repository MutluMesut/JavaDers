package day09_StringManipulation;

public class C08_LastIndexOf {
    public static void main(String[] args) {

        String str = " Javayi iyi ogrenmek icin cok calismak lazim cok.";
        System.out.println(str.indexOf("a"));//1

        System.out.println(str.lastIndexOf("a"));

        str.lastIndexOf("a",15);









        int ilkCokEndexi =str.indexOf("cok");
        int sonCOkEndexi = str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmamis");

        } else if (ilkCokEndexi==sonCOkEndexi) {
            System.out.println("cok kelimesi bir kez kullanilmis");


        }else {
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }


    }
}
