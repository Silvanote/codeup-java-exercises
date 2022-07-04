package PracticeOutofClass;

import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {

        String name = "Billy Bob Joe";

        System.out.println("Name:" + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First character" + name.charAt(0));
        System.out.println("last example" + name.length());
        System.out.println("last char: "+ name.charAt(6));
        System.out.println("Substring: " + name.substring(10,13));

    }
}
