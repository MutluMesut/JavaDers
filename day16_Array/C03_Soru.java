package day16_Array;

import java.util.Arrays;

public class C03_Soru {
    public static void main(String[] args) {
        // Verilen bir int Array de tum elementleri 5 arttır

        int [] arr= {2,4,6,8};

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=5;

        }
        System.out.println("Tum elemenlar 5 arttirildi: "+ Arrays.toString(arr) );



    }
}
