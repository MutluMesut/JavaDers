package day10_StringManipulations;

public class C12_tekar {
        public static void main(String[] args) {

                String sonuc = " 1-16 of over 100,000 results for \napple";
                int indexOver = sonuc.indexOf("over");
                int indexResults= sonuc.indexOf("results");
                String sonucSayisiStr = sonuc.substring(indexOver+5,indexResults-1);
                System.out.println(sonucSayisiStr.replace(",",""));
                int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);
                if (sonucSayisiInt>=10000){
                        System.out.println("Test PASSED");
                }else {
                        System.out.println( "Test FAILED");

                }



        }

}
