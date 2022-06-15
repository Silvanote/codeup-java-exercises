package PracticeOutofClass;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Pokemon 1");
        String pokemon1 = scan.nextLine();

        System.out.println("Enter Pokemon 2");
        String pokemon2 = scan.nextLine();

        System.out.println("Enter Pokemon 3");
        String pokemon3 = scan.nextLine();

        System.out.println("Enter Pokemon 4");
        String pokemon4 = scan.nextLine();

        System.out.println("Enter Pokemon 5");
        String pokemon5 = scan.nextLine();

        System.out.println("Here are your Pokemon players");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);
        System.out.println(pokemon5);

    }
}
