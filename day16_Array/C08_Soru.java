package day16_Array;

import java.util.Arrays;

public class C08_Soru {

    public static void main(String[] args) {
        // Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        //  Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int[] arr= {4,5,6,7};
        arr= sagaKaydir(arr);
        System.out.println(Arrays.toString(arr)); // [7, 4, 5, 6]


    }
    public static int[] sagaKaydir(int[] arr) {
        int temp = arr[arr.length - 1];//son indexdeki elemani temp atar
        for (int i = arr.length - 1; i >= 1; i--) {//0. indexi 1. indexe deger olark at
            arr[i] = arr[i - 1];                    //adıgimiz icin 1 i yazdik

        }
        arr[0] = temp;
        return arr;
    }

}
