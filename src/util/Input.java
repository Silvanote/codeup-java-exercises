import java.util.Scanner;

public util;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Need to display a string.");
        return scanner.nextLine();
    }
    boolean yesNo(){
        System.out.println("True or False?");
        String Input = scanner.nextLine();
        if(Input.equalsIgnoreCase("true");
        return true;
    } else{
        return false;
    }

    public int getInt(){
        System.out.println("Please give me an integer.");
        return scanner.nextInt();
    }
public double getDouble(double min, double max) {
    System.out.println("User, please enter two numbers between %d and %d. %n", min, max);
    int inputedNumber = scanner.nextInt();
    if(inputedNumber > min && inputedNumber < max) {
        return inputedNumber;
    } else {
        System.err.println("Enter another number between the numbers previously requested.");
        return getInt()(min, max);

        public double getDouble(double min, double max) {
            System.out.printf("User, please enter two numbers between %d and %d. %n", min, max);
            int inputedNumber = scanner.nextInt();
            if(inputedNumber > min && inputedNumber < max) {
                return inputedNumber;
            } else {
                System.err.println("Enter another number between the numbers previously requested.");
                return getInt()(min, max);
}
}
}