package day09_StringManipulation;

public class C07_ilkTest {
    public static void main(String[] args) {

        // gittigimiz web sayfasindan aldıgimiz String arama sonuclarinin
        // arama sonuclarinin 50 den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf = input.indexOf("of");
        int indexResults = input.indexOf("results");

        String sonucSayisiString = input.substring(indexOf+3,indexResults-1);

        int aramaSonucSayisi = Integer.parseInt(sonucSayisiString);
        if (aramaSonucSayisi>50){
            System.out.println("Nutella arama testi PASSED");

        }else {
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FAİLED");
        }











    }
}
