package day04_Increment_Concatenation.day11_forLoops;

public class C02_forLoop {
    public static void main(String[] args) {
        // input olarak verilen  stringde  indexi tek sayi olanları kucuk harfle
        // cift sayi olanlari kucuk harfle yadir
        
        String input = "Java candir, selenyum heyecandir";

        for (int i = 0; i < input.length() ; i++) {

            System.out.print(i%2==0
                                ? input.substring(i,i+1).toLowerCase()
                                :input.substring(i,i+1).toUpperCase()
                                );
            
        }
    }
}
