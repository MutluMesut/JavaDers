package day07_ternary_swicthStatements;

public class C09_switchStatements {
    public static void main(String[] args) {
        // kullanicidan gun numarasi al hafta ici veya hafta sonu yazdir

        int gunNo = 7;

        switch (gunNo){
            case 1 :
                System.out.println("hafta ici");
                break;
            case 2 :
                System.out.println("hafta ici");
                break;
            case 3 :
                System.out.println("hafta ici");
                break;
            case 4 :
                System.out.println("hafta ici");
                break;
            case 5 :
                System.out.println("hafta ici");
                break;
            case 6 :
                System.out.println("hafta sonu");
                break;
            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecersiz gun numarasi");
        }

        //
        int gun = 5;

        switch (gun) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecersiz gun numarasi");
        }
    }
}
