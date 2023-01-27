package day10_StringManipulations;

public class c14_tekrar {
    public static void main(String[] args) {

        //kullanicidan sifre iste
        //ilk harf kucuk olmali
        // son karakter rakam olmali
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali

        String sifre = "a1234  5e";
        int flag = 0;
        if(!(sifre.charAt(0)<='a'&&sifre.charAt(0)>='z')){
            System.out.println("ilk harf kucuk olmali");
            flag++;
        }if (sifre.length()-1<=1 && sifre.length()-1>=9){
            System.out.println("son karakter buyuk olmali");
            flag++;
        }if(!(sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
        }if (!(sifre.length()>=10)){
            System.out.println("sifre uzunlugu en az 10 karakter olmali");
            flag++;

        }if (flag==0){
            System.out.println("sifre basariyle tamamlandi");
        }




    }
}
