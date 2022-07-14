package PracticeOutofClass;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
try {
    int[] a = null;
    System.out.println(a[1]);
}catch (NullPointerException e){
    System.out.println("Your array is null");
}

}
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch (Exception e) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("What's your favorite number?");
//        try {
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch (Exception e) {
//            System.out.println("Please try again with a number");
//        }
//    }
}
