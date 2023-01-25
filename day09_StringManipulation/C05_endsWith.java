package day09_StringManipulation;

import java.util.Scanner;

public class C05_endsWith {
    public static void main(String[] args) {
        // kullanicidan mail al
        //@ icermiyorsa "gecersiz mail"
        //@gmail.com icermiyors " mail gmail olmali"
        //@gmail.com ile bitmiyorsa " mailde yazim hatasi var"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir mail giriniz");
        String girilenMail = scan.nextLine();

        if (!girilenMail.contains("@")) {
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");


        }

    }}
