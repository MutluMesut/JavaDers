package day09_StringManipulation;

public class C09_calismalarim {
    public static void main(String[] args) {
        // gittigimiz web sayfasindan aldıgimiz String arama sonuclarinin
        // arama sonuclarinin 50 den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";

        int OfIndex = input.indexOf("of");
        int resultsIndex = input.indexOf("results");
        String sonucSayisiString = input.substring(OfIndex+3, resultsIndex-1);
        int aramaSonucSayisi = Integer.parseInt(sonucSayisiString);

        if (aramaSonucSayisi>=50){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED");
        }

       String str = " Javayi iyi ogrenmek icin cok calismak lazim cok.";
        System.out.println(str.lastIndexOf("o",5));
        System.out.println(str.indexOf("a",5));
        System.out.println(str.lastIndexOf("a",6));


        // kullanicidan bir cumle al ve lastIndexOf() methodunu kullanarak arana

    }
}
