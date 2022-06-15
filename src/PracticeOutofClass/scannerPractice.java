package PracticeOutofClass;

import java.util.Scanner;

public class scannerPractice {

    public static void main(String[] args) {

        // Scanner is used to get input from user or to lines from a file.

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your first name?");

        String name = scan.next();

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);

            int caseSwitch = 1;

            switch (caseSwitch) {
                case 1:
                    System.out.println("Case 1");
                    // Fall through!
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }
        }

    }
}
