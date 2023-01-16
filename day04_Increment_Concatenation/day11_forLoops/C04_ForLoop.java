package day04_Increment_Concatenation.day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        // inpu olarak verilen sayidan bire kadar tum sayilari
        // yazdirin


        int input = 23;

        if (input>1){
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");

            }
        }else {
            for (int i = input; i <1 ; i++) {
                System.out.print(i+ " ");

            }


        }

    }


}
