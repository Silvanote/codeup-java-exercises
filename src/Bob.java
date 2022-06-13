import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner someAnswer = new Scanner(System.in);

        System.out.println("Ask Bob a question?");
        String BobResponses = someAnswer.next();
        if (BobResponses.endsWith("?")) {
            System.out.println("Sure");
        } else if (BobResponses.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (BobResponses.equals("")) {
        } else {
            System.out.println("Whatever");
        }
    }}
