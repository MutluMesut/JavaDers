package day03_dataCasting_MatematikselIslemler;

public class C06_modulus {
    public static void main(String[] args) {
        System.out.println(15 % 4);
        System.out.println(45 % 4);

        int girilenSayi = 3426;
        int birlerBasamagi = 3426%10;
        System.out.println("Birler basamagi :"+ birlerBasamagi);

        birlerBasamagi =girilenSayi/10;
        System.out.println(girilenSayi);

        System.out.println("Birler basamagi :"+ birlerBasamagi);

        girilenSayi =girilenSayi/10;
        System.out.println(girilenSayi);
    }
}
