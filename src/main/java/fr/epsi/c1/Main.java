package fr.epsi.c1;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Echauffement OHCE");

        Locale locale = Locale.getDefault();
        String lng = locale.getLanguage();

        Date date = new Date();
        int hours = date.getHours();

        String str = getInput();
        StringBuffer reverse = (new StringBuffer(str)).reverse();


        greetUser(str, hours, lng);
        checkPalindrome(str, String.valueOf(reverse));
        sayGoodbye(hours);
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        return sc.nextLine();
    }

    public static void greetUser(String str, int hours, String lng) {
        String greet = (hours < 12) ? "Bonjour" : "Bonsoir";

        if (lng.equals("en")) {
            greet = (hours < 12) ? "Good morning" : "Good evening";
        }
        System.out.println(greet + ", Vous avez saisi : " + str);
    }

    public static void checkPalindrome(String str, String reverse) {
        System.out.println("Miroir :" + reverse);
        Boolean isPalindrome = str.equals(reverse.toString());
        if (isPalindrome) {
            System.out.println("Bien dit !");
        } else {
            System.out.println("Pas bien dit !");
        }
    }

    public static void sayGoodbye(int hours) {

        if (hours < 17) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Bonne soirée !");
        }
    }
}