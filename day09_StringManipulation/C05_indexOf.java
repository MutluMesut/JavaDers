package day09_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok kolay";
        // str "cok" iceriyor mu
        System.out.println(str.contains("cok"));

        //kullaniddan aldigimiz cumlede "cok" ile baslayan ilk kelimeyi yazdır

        System.out.println(str.indexOf("cok"));

        System.out.println(str.indexOf("a",5));

        // ikinci o nun indexini yazdir

        int ilkOIndex= str.indexOf("o");
        int ikinciOIndex = str.indexOf("o",ilkOIndex+1);
        System.out.println(ikinciOIndex);




    }
}
