package day10_StringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java heyecandır";
        System.out.println(str.replaceFirst("a","e"));

        // ilk harf veya rakami * yap

        System.out.println(str.replaceFirst("\\w","*"));



    }
}
