package day10_StringManipulations;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // 4 e kadar carpim tablosu yazdir

        for (int i = 1; i <=4; i++) { // outer loop denir i nin carpilacagi sayiyi
                                      // kontrol eder

            for (int j = 1; j <=4 ; j++) {//inner loop denir ve önceki örnekteki
                                          // i degeerini kontrol eder
                System.out.println(i*j+ " ");

            }
            System.out.println("");
            //outer loop her bir deger artisi icin
            // inner loop bastan sona calisir
        }
    }
}
