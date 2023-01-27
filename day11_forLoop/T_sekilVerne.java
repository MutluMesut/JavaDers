package day11_forLoop;

public class T_sekilVerne {
       /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */
       public static void main(String[] args) {

           int input =8;

           for (int i = 1; i <=input ; i++) {
               for (int j = 1; j <=i ; j++) {
                   System.out.print("* ");

               }
               System.out.println("");
           }


           for (int i = input-1; i >=1 ; i--) {
               for (int j = 1; j <=i ; j++) {
                   System.out.print("* ");

               }
               System.out.println("");
           }


       }



}
