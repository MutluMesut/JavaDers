package day16_Array;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] arr1= new String[4];//null, null,null, null

        int[] arr2 ={1,2,3,4};

        System.out.println(arr2[2]);//5
        System.out.println(arr1[3]);//null

        //System.out.println(arr1[8]);//

        arr2[2]=15;
        arr2[0]=7;

        // tum arr yi yazdiralim
        System.out.println(arr2);

        //arr yin tammami yazdiralmak isteniyorsa Arrays class indan yardim almaliyiz

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));

    }
}
