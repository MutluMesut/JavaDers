package day11_forLoop;

public class C10_NestedLoop {
    public static void main(String[] args) {
        /*
            1                   1. satir 1’den 1’e kadar yazdir
            1  2                2. satir 1’den 2’e kadar yazdir
            1  2  3             3. satir 1’den 3’e kadar yazdir
            1  2  3  4.         4. satir 1’den 4’e kadar yazdir
         */

        int input=8;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) { //bu tarz sorularda ic dongu 1 den, dıs loop un i degerine kadar gider
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
}
