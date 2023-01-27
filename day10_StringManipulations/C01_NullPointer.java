package day10_StringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str3 ;
       // System.out.println(str3.length());

        //System.out.println(str3.concat("ali can"));
        //System.out.println(str3.substring(3,4));

        String str4 = null;
        //System.out.println(str4.length());
        //System.out.println(str4.substring(3, 4));

        System.out.println(str4);
        System.out.println(str4+ "Ali Can");//nullAli Can
        System.out.println(str4.concat("ali can")); //nullPointerException


    }
}
