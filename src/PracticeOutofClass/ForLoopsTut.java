package PracticeOutofClass;

public class ForLoopsTut {

    public static void main(String[] args) {

//        System.out.println("I love dogs!");
//        System.out.println("I love dogs!");
//        System.out.println("I love dogs!");
//        System.out.println("I love dogs!");
//        System.out.println("I love dogs!");

        for(int i = 0; i < 31; i++) {
            System.out.println("I don't like cats.");
            //why doesn't my loop keep going?? originally didn't put the curly braces.
        }
        for (int i = 0; i <15;  i++){
            System.out.println(i);
        }
        int [] grades = {98, 100, 43, 83, 60, 77};

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

    }
}
