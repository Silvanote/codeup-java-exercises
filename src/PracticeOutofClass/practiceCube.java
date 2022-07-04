package PracticeOutofClass;

import java.util.Arrays;
import java.util.Scanner;

public class practiceCube {


    public static int difference(int x, int y) {
        return x - y;
    }

    public static double difference(double x, double y) {
        return x - y;
    }

    public static int cubed(int num) {

        return num * num * num;
    }

    public static double median(int[] nums) {
        Arrays.sort(nums);
        double median;
        int arrlength = nums.length;
        if (arrlength % 2 == 0) {
            double sumOfmid = nums[arrlength / 2] + nums[arrlength / 2 - 1];
            median =  sumOfmid / 2;
        } else {
            median = nums[arrlength / 2];
        }
        return (double)median;

    }
//}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter a number");
        int y = sc.nextInt();

        System.out.println(difference(x, y));

        System.out.println("What number do you want to cube?");
        int cubedNum = sc.nextInt();
        int[] c = {1,3,4,2,6,5,8,7};
        System.out.println(cubed(cubedNum));
        System.out.println(median(c));
    }
}

