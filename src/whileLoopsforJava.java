import java.util.ArrayList;
import java.util.Scanner;

public class whileLoopsforJava {
    public static void main(String[] args) {

        int a = 0;

//        for(int i = 0; i < 10; i++){
//            System.out.println("i is less than 10: " + i);
//        }
//
//        while (a < 10){
//            System.out.println("a is less than 10: " + a);
//            a++;
//        }
//        do {
//            System.out.println("a");
//        } while (a == 1);

        String sentence = "flapjacks are awesome, get all words seperated into an array list data structure!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while(scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
