package day04_Increment_Concatenation.day11_forLoops;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        // kullanicidan bir String iste ve String i tersten yazdir

        String str = "Java ogrenmek icin cok calismak lazim";

        String terstenStr= "";
        for (int i = str.length()-1; i >=0; i--) {
            terstenStr+= str.substring(i,i+1);

        }
        System.out.println("girilen cumlenin tersten yazilisi: "+ terstenStr);
    }
}
