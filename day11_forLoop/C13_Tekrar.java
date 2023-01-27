package day11_forLoop;

public class C13_Tekrar {
    public static void main(String[] args) {
        String str = "Java ogrenmek icin cok calismak lazim";
        String terstenStr ="";

        for (int i = str.length()-1; i >=1; i--) {
            terstenStr+= str.substring(i,i+1);

        }
        System.out.println("girilen cumlenin tersten yazilisi: "+ terstenStr);


        System.out.println();

        // verilen input'a gore carpim tablosu olusturun
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim
        int input = 4 ;

        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");
        }

    }
}
