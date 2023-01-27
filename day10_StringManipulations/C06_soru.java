package day10_StringManipulations;

public class C06_soru {
    public static void main(String[] args) {

        //kullanicidan sifre iste
        //ilk harf kucuk olmali
        // son karakter rakam olmali
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali
        
        String sifre = "abc44444444 4";

        int flag = 0;
        //ilk harf kucuk olmali
        if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
            System.out.println("Ilk harf kucuk olmali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if (!(sifre.contains(" "))) {
            System.out.println("sifre bosluk icermeli");
            flag++;
            
        }
        if (!(sifre.length()>=10)) {
            System.out.println("sifre en az 10 hane olmali");
            flag++;
            
        }
        if (flag==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }


    }
}
