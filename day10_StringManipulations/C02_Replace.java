package day10_StringManipulations;

public class C02_Replace {
    public static void main(String[] args) {

        String str = "Java ogren, adana ye:)";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replaceAll(" ", ""));

        str.replace("Java","Yazilim");
        System.out.println(str);

        String telefon = "376833-87433";

        //Asagidaki arama sonucunun 10000 den fazla oldugunu test edin

        String sonuc = "1-16 of over 100,000 results for \" apple\"";

        int indexOver = sonuc.indexOf("over");
        int indexResults = sonuc.indexOf("results");

        String sonucSayisiStr = sonuc.substring(indexOver+5,indexResults-1);

        System.out.println(sonucSayisiStr.replace(",",""));

        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt>10000){
            System.out.println( "TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }


    }
}
