package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public void clear() {
        scanner.nextLine();
    }

    public String getString() {
        System.out.println("Hit \"enter\" because this string is only here to start the OOP Exercise");
        return scanner.nextLine();
    }

    public boolean yesorno() {
        System.out.println("type yes or no");
        String trueOrFalse = this.scanner.nextLine();
//        trueOrFalse = trueOrFalse.toLowerCase();
        if(trueOrFalse.equalsIgnoreCase("no")){
                System.out.println("Need the number still");
                return yesorno();
         }else{
                System.out.println("Thank you");
                return yesorno();
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
            System.err.println("Please follow the instructions and number must be within range specified.");
            return getDouble(min, max);
        }
    }
    public long getHex() {
        System.out.println("Start with inputting a hexadecimal number");
        while (true) {
            try {
                long hexidecimal = Long.valueOf(scanner.nextLine(), 16);
                System.out.println("Number is a hexadecimal numbrer");
                return hexidecimal;
            } catch (NumberFormatException e) {
                System.out.println("This is not a hexadecimal, pick again.");
            }
        }
    }

    public long getBinary() {
        System.out.println("Start with inputting a binary number");
        while (true) {
            try {
                long binary = Long.valueOf(scanner.nextLine(), 4);
                System.out.println("Number is a binary number");
                return binary;
            } catch (NumberFormatException e) {
                System.out.println("This is not a binary number, pick again..");
            }
        }
    }

}
