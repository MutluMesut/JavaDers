package day07_ternary_swicthStatements;

public class C04_ternary {
    public static void main(String[] args) {
        //kullanicidan alınan deger
        // 100 den buyukse sayiyi 2 ile carp
        // 100 esit veya kucukse sayiya 10 ekle


        int input =101;

        if (input>100){
            input*=2;

        }else {
            input+=10;

        }
        System.out.println( "if else ile : " +input);

        input = 101;

        input= input>100 ? input*2 :input+10;
        System.out.println("ternary ile: "+input);

    }
}
