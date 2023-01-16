package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi= 20;
        sayi += 3;
        sayi = sayi+3;
        System.out.println(sayi);

        //sayinin degerini 2 azalt

        sayi-=2;
        sayi = sayi-2;
        System.out.println(sayi);

        sayi= 10;
        //sayinin degerini 1 azalt ve yazdir

        sayi--;
        System.out.println(sayi);//9

        sayi = 10;
        // sayiyi önce yazdir, sonra 1 azaltin

        System.out.println(sayi); //10
        sayi--;
        // ekranda gorulen 10, ancak sayinin degeri 9 olur

        sayi =10;
        System.out.println(sayi++);
        //java ayni satirda iki islem oldugundan siralama yapar
        //++ variableden sonra ise arttırma sonra yapilir
        //yani önce yazdirma sonra arttirma yapilir
        System.out.println(sayi);


        sayi =10;
        System.out.println(++sayi);
        //burda arttirma islemi once arttirma sonra yazdirma yapar
        System.out.println(sayi);






    }

}
