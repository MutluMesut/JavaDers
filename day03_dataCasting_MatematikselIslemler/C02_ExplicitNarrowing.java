package day03_dataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        // eger genis kapsamlı data turunden dar kapsamlı bir dataya casting
        //yapabilmek icin donusturmek istedigimiz data turu ön tarafa yaz

        double dbl = 23.5;
        int sayi = (int)dbl;
        System.out.println(sayi);//23

        byte byt = (byte) sayi;
        System.out.println(byt);//23

        sayi = 130;
        byt = (byte)sayi;// int daha kpsamli oldugu icin otomatik atama yapmaz müdahale
        //ister
        System.out.println(byt);



        sayi = 256;
        byt = (byte)sayi;// int daha kpsamli oldugu icin otomatik atama yapmaz müdahale
        //ister
        System.out.println(byt);


    }
}
