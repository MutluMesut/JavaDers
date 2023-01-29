package day12_MethodCretion;

public class C10_MethodAradakiniYazdirma {
    public static void main(String[] args) {
        // Konu anlatım sorusu= kullanicidan input olarak verilen bir string i bas. index i dahil,
        // bitis ind. haric sekilde aradaki harflari yazdiran method olustur
        //eger kullanici baslangıc degeri olark bitis degeriendn buyuk bir sayi girerse hata uyarıisi verilsin
        //yine str da olan indexlerden daha buyuk bir index girerse hata mesaji verilesin

       String str = "her sey java ogrenmek icin";
       yazdir(str,0,8);



    }
    public static void yazdir(String str,int sayi1,int sayi2){

        if (sayi1>sayi2){
            System.out.println("baslangıc bitisten kucuk olmalidir");

        } else if (sayi1<0||sayi2>str.length()-1) {
            System.out.println("Baslangıc ve bitis degerleri indexten buyuk olamaz");

        }else{
            for (int i = sayi1; i <sayi2 ; i++) {

            }
            System.out.println(str.substring(sayi1,sayi2));





        }





    }

}














