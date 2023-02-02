package day15_Scape_Arrays;

public class C04_Array {
    public static void main(String[] args) {

        int[] arr ={1,2,3}; // bu sekilde yazildiginda kac element yazildi ise onu length olarak kabul eder
        int arr2[]= {4,5,6,7,8,9};
        String[] harfler = new String[4000];
        System.out.println(arr.length); // 3
        System.out.println(arr2.length); // 6
        System.out.println(harfler.length); // 4000
        // String'de kullandigimiz harfler.length() bir method iken
        // array'deki length method degil variable'dir  arr.length

    }
}
