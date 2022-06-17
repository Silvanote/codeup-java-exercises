package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public void clear() {
        scanner.nextLine();
    }

    public String getString() {
        System.out.println("This input must be a string but input a number");
        return scanner.nextLine();
    }

    public boolean theTruth() {
        System.out.println("Please provide a number aka int.");
        String trueOrFalse = this.scanner.nextLine();
        trueOrFalse = trueOrFalse.toLowerCase();
        if(trueOrFalse.equalsIgnoreCase("no")){
                System.out.println("Need the number still");
                return theTruth();
         }else{
                return theTruth();
        }
    }

    public int getInt() {
        System.out.println("Please provide an integer again");
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number (int) between %d and %d.%n", min, max);
        int Intergerneeded = scanner.nextInt();
        if (Intergerneeded > min && Intergerneeded < max) {
            return Intergerneeded;
        } else {
            System.err.println("You have entered a number that needs to be within set parameters");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Provide a number to double!");
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between the following numbers of  %f and %f.%n", min, max);
        double dubInput = scanner.nextDouble();
        if (dubInput > min && dubInput < max) {
            return dubInput;
        } else {
            System.err.println("Number out of range!");
            return getDouble(min, max);
        }
    }

}
