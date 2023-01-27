package day10_StringManipulations;

public class C08_forLoop {
    public static void main(String[] args) {
        // 1 ile 1000(sinirlar dahi) arasindaki sayilari yan yana yazdir
        // yazdirmadan sonra "tum bu sayilarin toplami= " deyip sayilarin top yazdir

        int sayilarinToplami = 0;

        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i + " ");
           // sayilarinToplami = sayilarinToplami+i;

            sayilarinToplami+=i;

        }
        System.out.println("");
        System.out.println("tum bu sayilarin toplami:" + sayilarinToplami);
    }
}
