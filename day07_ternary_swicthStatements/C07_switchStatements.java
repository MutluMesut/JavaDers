package day07_ternary_swicthStatements;

public class C07_switchStatements {
    public static void main(String[] args) {
        //kullanidan iki sayi al ve kullaniciya istedigi islemi sor
        //+ * - / isaretlerinden hangisini girerse
        // iki sayi icin o islemi yapin
        //girmezse "yanlis islem tercihi" yazdir

        int sayi1 = 20;
        int sayi2 = 10;

        char islem = '-';
        // if else ile yapalım

        if (islem=='+'){
            System.out.println("sayilarin toplami: "+(sayi1+sayi2));
        } else if (islem =='-') {
            System.out.println("sayilarin farki: "+(sayi1-sayi2));

        } else if ( islem=='*') {
            System.out.println("sayilarin carpimi: " +(sayi1*sayi2));


        } else if (islem=='/') {
            System.out.println("sayilarin bolumu: "+ (sayi1/sayi2));

        }else {
            System.out.println("yanlis islem tercihi");
        }

        // switch ile yapalim
        switch (islem){
            case '+':
                System.out.println("sayilarin toplami: "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println("sayilarin farki : "+(sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayilarin carpimi: " +(sayi1*sayi2));
                break;
            case '/':
                System.out.println("sayilarin bolumu: "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("yanlis islem tercihi");

        }

    }
}
