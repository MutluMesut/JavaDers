package day07_ternary_swicthStatements;

public class C06_ternary {
    public static void main(String[] args) {

      //kullanicidan not al 50 veya  buyukse " sinifi gectin
      // degilse "maalesef kaldın" yazdır

        int input = 54;
        System.out.println(input>=50 ? "sinifi gectin": "maalesaf kaldin");

        //kullanicidan harf iste kucuk harf ise onu buyuk yazdir
        // degilse girilen harfin kendisini yazdir

        char girilenHarf = '*';
        System.out.println(girilenHarf>='a' && girilenHarf<='z' ? (char) (girilenHarf-32):girilenHarf);

        //kullanicindan alinan sayinin mutlak degerini al

        input= 5;
        System.out.println(input>0 ? input : (-1)*input);



    }
}
