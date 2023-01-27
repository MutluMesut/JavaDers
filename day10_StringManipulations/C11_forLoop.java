package day10_StringManipulations;

public class C11_forLoop {
    public static void main(String[] args) {
        // verilen sayinin faktoriyelini bul


        int input = 6;
        int carpim = 1;

        for (int i = input; i >=1; i--) {
            carpim*=i;


        }
        System.out.println("verilen " +input+ "sayisinin faktoriyeli "+carpim);

    }
}
