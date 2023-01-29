package day12_MethodCretion;

public class C08_Palindrom {
    public static void main(String[] args) {
        //veilen bir String in palindrome olup olmadinin yzdir
        //Palindrome : tersten ve duzden okunusu ayni olan

        String str = "ey edip adanada pide ye";
        String terstenStr = C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(terstenStr)){
            System.out.println("cumle palindrome");
        }else{
            System.out.println("palindrome degil");
        }
    }
}
