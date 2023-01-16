package day04_Increment_Concatenation.day11_forLoops;

public class C06_forLoop {
    public static void main(String[] args) {
        // kitaptali 8. soru kulrinlanicidan pozştif tamsayi al
        //1 den baslayarak tum sayilri yazdirin
        // 3 ile bolunebilen bir sayi gelirse sayi  yerine fizz
        // 5 ile bolunebilen bir sayi gelirse sayi yerine buzz
        // her ikisine bolunurse saui yerine fizzBuzz yzdir

        int input = 153;
        for (int i = 1; i <=input ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzBuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");

            } else if (i%5==0) {
                System.out.print("buzz ");

            }else{
                System.out.print(i+ " ");
            }

        }
    }
}
