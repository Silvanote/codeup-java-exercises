public class StringExercise {

    public static void main(String[] args) {
        String Statement = "We don't need no education";
        System.out.println(Statement);

        System.out.println(Statement.replace( "education", "thought control"));

        System.out.println("Check \"this\" out, \"s inside of \"s!");

        System.out.println("In windows, the main drive is usually C:\\");

        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");
    }
}
//    String message = "Hello";
//System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ")
//        String userInput = sc.next();
//
//// Don't do this!
//        boolean confirmation = userInput == "y";
//        String input = "Codeup Rocks!";
//
//        input.equals("codeup rocks!"); // false
//        input.equals("Codeup Rocks!"); // true
//
//        input.equalsIgnoreCase("codeup rocks!"); // true
//        input.equalsIgnoreCase("Codeup Rocks!"); // true
//
//        input.startsWith("codeup") // false
//        input.startsWith("Codeup") // true
//
//        input.endsWith("rocks") // false
//        input.endsWith("rocks!") // false
//        input.endsWith("Rocks!") // true