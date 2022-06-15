import java.util.ArrayList;
import java.util.Scanner;

public class consoleAdventureGame {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Are you ready to play? Press y for yes or n for no.");
//        String start = scan.nextLine();
//        scan.next();
        String choice = scan.next();
        System.out.println(choice);
        if (choice.equals("n")) {
            System.out.println("Be a lot cooler if you did want to play this game.");
        } else if (choice.equals("y")) {
            System.out.println("Let's Go!");
        } else {
            System.out.println("Pick y or n...again");
        }


                System.out.println("Enter Player 1 Character Name");
                String player1 = scan.nextLine();
                scan.nextLine();

                System.out.println("Enter Player 2 Character Name");
                String player2 = scan.nextLine();

                System.out.println("Enter Player 3 Character Name");
                String player3 = scan.nextLine();

                System.out.println("These are the players on your squad.");
                System.out.println(player1);
                System.out.println(player2);
                System.out.println(player3);

                String Squad = "Suit up the following players:  " + player1 + ", " + player2 + ", and " + player3 + ".";
        System.out.println(Squad);


        System.out.println ("Health80% Strength80% PowerPunch65%");
        String player1stats = scan.nextLine();
        System.out.println ("Health70% Strength90% PowerPunch90%");
        String player2stats = scan.nextLine();
        System.out.println("Health100% Strength 50% PowerPunch80%");
        String player3stats = scan.nextLine();

        Scanner scan1 = new Scanner(player1stats);
        ArrayList<String> characteristics = new ArrayList<String>();

        while(scan1.hasNext()){
            characteristics.add(scan1.next());
        }
        System.out.println(characteristics);

//
//        String sentence = "flapjacks are awesome, get all words seperated into an array list data structure!";
//        Scanner scan = new Scanner(sentence);
//        ArrayList<String> words = new ArrayList<String>();
//
//        while(scan.hasNext()){
//            words.add(scan.next());
//        }
//        System.out.println(words);
//    }
//}
            }
        }



