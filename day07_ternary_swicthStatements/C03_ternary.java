package day07_ternary_swicthStatements;

public class C03_ternary {
    public static void main(String[] args) {
        //input olarak verilen sayiyi kkontrıol et
        //sayi cift ise "cift sayi"
        // degilse "tek sayi " yazdir

        // if else ile yaplım

        int input =44;

        if (input%2==0){
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        //ternary ile yapalim

        System.out.println(input % 2 == 0 ? "cift sayi" : "tek sayi");

    }
}
