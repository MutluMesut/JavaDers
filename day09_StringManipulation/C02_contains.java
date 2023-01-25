package day09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
       String str = " Java ogren, mutlu ol";

       str.contains("mutlu");
        System.out.println(str.contains("mutlu"));
        System.out.println(str.contains("j"));

        System.out.println(str.contains(" "));

        System.out.println(str.contains("J") && str.contains("mutlu"));

    }
}
