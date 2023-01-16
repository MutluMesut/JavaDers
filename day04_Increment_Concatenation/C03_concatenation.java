package day04_Increment_Concatenation;
public class C03_concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str1 = "";
        String str2 = " ";
        String str3 = "-";
        System.out.println(a+b);//30

        System.out.println(str1+a+b); //1020

        System.out.println(a+b+str3);//10+20+"-"=="30-"

        System.out.println(a+str2+b); //10+" "+20==10

        System.out.println(str1+a+b); //"200"

        System.out.println(str2+(a+b)); //" 30"









    }
}
