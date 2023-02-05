package day16_Array;

import java.util.Arrays;

public class C04_Soru {
    public static void main(String[] args) {
        //Verilen String arry de istenen harfi iceren kelimelri silip yerine
        // null yzdir

        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silineceHarf="u";

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].contains("u")){
                isimler[i]=null;

            }

        }
        System.out.println(Arrays.toString(isimler));

    }
}
