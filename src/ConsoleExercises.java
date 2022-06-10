import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String name = "value";
        System.out.printf("The " + name + " of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println("num");

//        System.out.println("You need to enter 3 words");
//        String one = scanner.next();
//        String two = scanner.next();
//        String three = scanner.next();
//        System.out.printf("you said: %s %s %s", one, two, three);
        // only the first three words will show up if you put more than three words.
//        System.out.println("Ask a question?");
//        String sentence = scanner.next();
//        System.out.println(sentence);
        // Next to be adjusted for the whole line, needs to change from "next" to "nextline"

        System.out.println("Measure the classroom.");

        int sizelength = Integer.parseInt(scanner.nextLine());
        System.out.println("Measure the classroom.");
        System.out.println(Integer.parseInt(scanner.nextLine()));
        int sizewidth = Integer.parseInt(scanner.nextLine());
        System.out.printf("The room size is %d by %d which means the size of the area is %d and %d", sizewidth, sizelength, sizewidth * sizelength, (sizewidth*2 + sizelength*2));





//        parseInt(java.lang.String, int)
    }
}

