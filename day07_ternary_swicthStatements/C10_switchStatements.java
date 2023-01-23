package day07_ternary_swicthStatements;

public class C10_switchStatements {
    public static void main(String[] args) {
        // kullanicidan ISTQB kisaltmasindan harfin
        //anlamini ogrenmek istedigini al
        // ve girilen harfin karsiligini yazdirin
        // I: ınternational S :Software T : Testing
        // Q :Qualifications B : Board

        char harf = 'q';

        switch (harf){
            case 'ı':
            case 'I':
                System.out.println("International");
                break;
            case 's':
            case 'S':
                System.out.println("Software");
                break;
            case 'q':
            case 'Q':
                System.out.println("Qualifications") ;
                break;
            case 'b':
            case 'B':
                System.out.println("board");
                break;
            case 't':
            case 'T':
                System.out.println("testing");
            default:
                System.out.println("gecersiz harf");
        }
    }
}
