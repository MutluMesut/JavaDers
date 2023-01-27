package day10_StringManipulations;

public class C10_forLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayarak 7 ser 7 srr
        // arttirarak input olarak verile n bitis sayisina kadar
        // tum sayilari yazdir
        // kac adet sayi oldugunu
        // ve sayilarin toplaminin kac oldugunu yazdir

        int inputBas = 34;
        int inputBit = 563;

        int sayac = 0;
        int toplam = 0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i+ " ");
            sayac++;
            toplam+=i;

        }

        System.out.println("Toplam "+ sayac+ "adet sayi var\n Bu sayilarin toplami" +
                           ": " +toplam);

    }
}
