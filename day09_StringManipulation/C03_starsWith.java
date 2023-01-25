package day09_StringManipulation;

public class C03_starsWith {
    public static void main(String[] args) {
       String str = "Java mutluluktur";

        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("j"));

        str.startsWith("");

        System.out.println(str.startsWith("mutlu", 5));
        System.out.println(str.startsWith("v",2));


    }
}
