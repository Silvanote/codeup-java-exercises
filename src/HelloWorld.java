import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // EXERCISES
//1.
        int myFavoriteNumber = 1;
            System.out.println(myFavoriteNumber);
//2.
        String myString = "This is a String.";

        //3.
//        mystring = "another string"

//4. Already defined in data type
//        String myString = "3.14159";

        //5. Long number assigned but doesn't let me use SOUT unless an long number is defined. Value hasn't been initialized.
//        long myNumber = 44345;

// 6.  3.14 is not allowed to be used
//long myNumber = 3.14; This is a floating point number, (need to put Math.PI)

//7. Works (instructor said should've had problem with Java 8 but now not a problem.
long myNumber = 123L;
            System.out.println(myNumber);

//8. Variable 'myNumber' is already defined in the scope
//long myNumber = 123;

        //9. Variable 'myNumber' is already defined in the scope. Needs an F or (float) feature. Cast into float.

//        float myNumber = 3.14F;
            System.out.println(myNumber);

        //10. First printed out 5 then 6. Then printed 6 and 6 due to incrementing differently.

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

// 11. Not a statement, Identifier unexpected.
//        String class = "this is a string class." It is protected data type.

        //12. The code doesn't work because it should be a number, not a string of "three".  The int feature should be 3 not "three."  First part gives you an exception and second part gives you an error.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //13. Rewrite the following expressions:
//        int x = 4;
//        x +=  + 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        int input = Integer.MAX_VALUE;
        System.out.println(++input);

//        /*
//        */
//        System.out.format("Hello, %s!", "Dennis");
//    }
//}
        // Multiline comments are back
        var jeff = "Jeff";
// jeff = jeff.length();
        byte tinyNum = 127;
        tinyNum++;

        final int num = 235000;

        final String finalFantasy = "Final Fantasy";

        long id = 1L;
        System.out.println(tinyNum);
        System.out.println(id);
        System.out.format("Hello, %s!\n", "Dennis");

        float floater = 8.27F;
        // OR float floater = (float) 8.27;
        float noDecimal = 9;

        System.out.println(floater);
        System.out.println(noDecimal);

        char charmander = '&';
        System.out.println(charmander);

        String message = "\tI really really like marshmallows.";
        System.out.println(message);

        boolean doingJavaRightNow = true;
        if (doingJavaRightNow == true) {
            System.out.println("Wow, look at me!");
        }
        int makeItANum = (int) tinyNum;
    }
}