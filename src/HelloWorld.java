import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
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
        if(doingJavaRightNow == true){
            System.out.println("Wow, look at me!");
        }
        int makeItANum = (int) tinyNum;
    }
}