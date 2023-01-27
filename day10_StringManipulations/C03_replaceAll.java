package day10_StringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        //sayilarindan kurtul

      String str = "Ja1va 56Guz,el-dir";
      str= str.replaceAll("\\d","");

      str= str.replace(" ","5");
      str = str.replace("5"," ");
      str = str.replaceAll("\\W","");

        System.out.println(str);




    }
}
