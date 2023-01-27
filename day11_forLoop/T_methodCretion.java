package day11_forLoop;

public class T_methodCretion {
    public static void main(String[] args) {
        String str = "Calismaya devam";
        sayiTopla(2,3); // 17 void olan method calisti

       System.out.println(sayiToplaDondur(56, 90));//146 ===> 1-return type li methodu ya dogrudan yazdırmali

       int sonuc =sayiToplaDondur(90,80);          // 2-ya da sonucu data turune uygun bir variable atamaliyiz
       // 170 dondurup sonuc a assign eder


       // istersek sonuc u yazdirabiliriz

       System.out.println(sonuc);


    }
    public  static void sayiTopla(int sayi1, int sayi2){

    }

    public static int sayiToplaDondur(int sayi1, int sayi2){

        return sayi1+sayi2;
    }

}
