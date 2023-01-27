package day11_forLoop;

public class T_methodCreation {
    public static void main(String[] args) {
        String str= "Java candir";

        deneme(str);                            //JAVA CANDİR
        System.out.println(deneme(str));




    }
    public static String deneme(String str){   // bize string sonuc donduren bu methodu ya
        System.out.println(str.toUpperCase());  //1-direkt yazdirmaliyiz ya da

        str=  str.toUpperCase();                //2- data turune uygun bir variable a atamaliyiz



     return str  ;
    }
}
