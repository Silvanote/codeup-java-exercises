import java.sql.SQLOutput;
import java.util.Scanner;

public class todaysPractice {

        public static void main(String[] args) {
            Scanner fetch = new Scanner(System.in);

            System.out.println("Whats your first name?");
            String name = fetch.next();

            System.out.println("What is your age?");
            int age = fetch.nextInt();

            System.out.println("What's your quote?");
            String quote = fetch.next();
            quote += fetch.nextLine();

            System.out.println("Thank you " + name + ", your are " + age + "years old." );
            System.out.println("and your quote is " + quote + ".");

        }
    }

