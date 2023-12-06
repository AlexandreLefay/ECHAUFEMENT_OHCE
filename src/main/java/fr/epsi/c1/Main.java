package fr.epsi.c1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Echauffement OHCE");
        String str = getInput();
        greetUser(str);
        checkPalindrome(str);
        sayGoodbye();
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        return sc.nextLine();
    }

    public static void greetUser(String str) {
        Date date = new Date();
        int hours = date.getHours();
        String greet = (hours < 12) ? "Bonjour" : "Bonsoir";
        System.out.println(greet + ", Vous avez saisi : " + str);
    }

    public static void checkPalindrome(String str) {
        StringBuffer reverse = (new StringBuffer(str)).reverse();
        System.out.println("Miroir :" + reverse);
        Boolean isPalindrome = str.equals(reverse.toString());
        if (isPalindrome) {
            System.out.println("Bien dit !");
        } else {
            System.out.println("Pas bien dit !");
        }
    }

    public static void sayGoodbye() {
        Date date = new Date();
        int hours = date.getHours();

        if (hours < 12) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Bonne soirée !");
        }
    }
}