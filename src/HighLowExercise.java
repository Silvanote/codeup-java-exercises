import java.util.Scanner;

public class HighLowExercise {
    public static void GameDevelopment() {


        int pickRandom = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("User, please pick a number between 1 and 100");

        int pickAnswer = scan.nextInt();

        if (pickAnswer == pickRandom) {
            System.out.println("GOOD GUESS");
        } else if (pickAnswer < pickRandom) {
            System.out.println("HIGHER");
        } else if (pickAnswer > pickRandom) {
            System.out.println("LOWER");
            GameDevelopment();
        }
    }


    public static void main(String[] args) {

    }
}
