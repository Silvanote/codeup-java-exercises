import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String name = "Paul";
        System.out.println("Hi, I'm" + name + "!\n");
        System.out.println("I like cheese!\n");

        System.out.printf("Hi, I'm %s! I'm %.1f years old!", name ,28.5);
        System.out.println("Let's talk input!");

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hey, tell me about the NBA Finals:");
//        String userInput = scanner.next();
//        String anotherOne = scanner.next();
//
//        System.out.println("You said: " + userInput);
//        System.out.println((anotherOne));
        System.out.println("Hey, whats your favorite number?");
        int yourFavoriteNumber = scanner.nextInt();
        System.out.println(yourFavoriteNumber);
        scanner.nextLine();
        System.out.println("Hey, what's your favorite color?");
        String yourFavoriteColor = scanner.next();
        System.out.println(yourFavoriteColor);
    }
}
