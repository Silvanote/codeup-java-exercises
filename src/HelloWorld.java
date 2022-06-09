import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // EXERCISES
//1.
        int myFavoriteNumber = 1;
//2.
        String myString = "This is a String.";
        //3.
//        mystring = "another string"
//4. Already defined
//        String myString = "3.14159";
        //5. Long number assigned but doesn't let me use SOUT unless an long number is defined.
//        long myNumber = 44345;
// 6.  3.14 is not allowed to be used
//long myNumber = 3.14; need to put Math.PI

//7. Works
long myNumber = 123L;

//8. Variable 'myNumber' is already defined in the scope
//long myNumber = 123;

        //9. Variable 'myNumber' is already defined in the scope. Needs to be fixed by making sure the variable is not redefined or use a different name of "myNumber".

//        float myNumber = 3.14;

        //10. First printed out 5 then 6. Then printed 6 and 6 due to incrementing differently.

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
// 11. Not a statement, Identifier unexpected.
//        String class = "this is a string class.".

        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //13. Rewrite the following expressions:
        int a = 4;
        a = a + 5;

        int i = 3;
        int j = 4;
        myNumber = j * x;

        int s = 10;
        int y = 2;
        s = s / y;
        y = y - s;

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