import java.util.Scanner;

public class consoleAdventureGame {
    public static void main(String[] args) {

        String Start = "Are you ready to play? Press y for yes or n for no.";
                Scanner scan = new Scanner(System.in);
        System.out.println(Start);


                System.out.println("Enter Player 1 Character Name");
                String pokemon1 = scan.nextLine();

                System.out.println("Enter Player 2 Character Name");
                String pokemon2 = scan.nextLine();

                System.out.println("Enter Player 3 Character Name");
                String pokemon3 = scan.nextLine();


                System.out.println("These are the players on your squad.");
                System.out.println(pokemon1);
                System.out.println(pokemon2);
                System.out.println(pokemon3);

                String Squad = "Suit up the following players:  " + pokemon1 + ", " + pokemon2 + ", and " + pokemon3 + ".";
        System.out.println(Squad);
            }
        }



