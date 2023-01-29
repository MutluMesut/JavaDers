package day12_MethodCretion;

public class T_methodIsimSoysisim {
    public static void main(String[] args) {

        String isim= "mutlu";
        String soyisim= "TANKİSİ";

        duzelt(isim,soyisim);
        System.out.println(isim);


    }
    public static String duzelt(String isim,String soyisim){
        String isim1="";
        String soyisim1="";
        isim1.toUpperCase().charAt(0);
        soyisim1.toLowerCase().substring(1,soyisim1.length()-1);
        System.out.println(isim1);




        return duzelt(isim,soyisim);
    }
}
