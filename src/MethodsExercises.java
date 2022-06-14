import java.util.Scanner;

public class MethodsExercises {

    //    public static void main(String[] args) {
//        String Addition = "Juan adds equal to 8 because";
//        int x = 3;
//        int y = 5;
//        String Adds = (Addition + " " + x + " +  " + y + ".");
//        System.out.println(Adds);
//
//        public static int getInteger(int min, int max);

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int sub1, int sub2) {
        return sub1 - sub2;
    }

    public static int multiply(int mult1, int mult2) {
        return mult1 - mult2;
    }

    public static double divide(double div1, double div2) {
        return div1 / div2;
    }

    public static double modulus(double mod1, double mod2) {
        return mod1 % mod2;
    }


    //2.
    public static int getInteger(int min, int max) {
        Scanner fetch = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");

        int userInput = fetch.nextInt();
        if (userInput < min) {
            return getInteger(min, max);
        }

        return userInput;
    }

//. 3 Factorial of a number

        public static void factorial() {
        Scanner numberFactor = new Scanner(System.in);
        String loopy;

        do {
            int getNumber = getInteger(1, 10);
            int factorNumber = 1;
            System.out.println((getNumber + 8));
            System.out.print(getNumber + "! = ");

            for (int i = 1; i <= getNumber; i++) {
                factorNumber *= i;
                if (i == getNumber) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.println(factorNumber);
            System.out.println("Pick a number again or press no");
            loopy = numberFactor.next();
        } while (loopy.equalsIgnoreCase("yes"));
    }

    //4. Dice Rolling
    public static void diceRoll() {
        Scanner scandice = new Scanner(System.in);
        System.out.println("User, please give me number of side for a pair of dice.");
        int diceSides = scandice.nextInt();
        int Dice1 = (int) (Math.random() * diceSides) + 1;
        int Dice2 = (int) (Math.random() * diceSides) + 1;

        System.out.println(Dice1 + "is the first die and " + Dice2 + "is the value of the second one.");

    }

    //            return number;
    public static void main(String[] args) {
        System.out.println(addition(5, 8));
        System.out.println(subtraction(25, 5));
        System.out.println(multiply(30, 5));
        System.out.println(divide(50, 10));
        System.out.println(modulus(20, 5));

        System.out.println(getInteger(1,10));
        factorial();
        diceRoll();

    }
}





