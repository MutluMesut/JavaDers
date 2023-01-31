package day13_methodOverLoading_whileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {




    }
    public static void toplama(double sayi1, int sayi2){
        System.out.println("double ve int toplami :" + (sayi1+sayi2));
    }
    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplami :" + (sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami :" + (sayi1+sayi2));

    }
}
