package day12_MethodCretion;

public class T1_MethodİlePalindrome {
    public static void main(String[] args) {
        //veilen bir String in palindrome olup olmadinin dondurun
        //Palindrome : tersten ve duzden okunusu ayni olan

        String str= "ey edip pide ye";
        String terstenStr= "";
        System.out.println(metniTerseCevir(str));


    }
    public static String metniTerseCevir(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);

            }
        if (str.equals(tersStr)){
            System.out.println("cumle palindrome");
        }else{
            System.out.println("palindrome degil");
        }
        return tersStr;




    }

}
