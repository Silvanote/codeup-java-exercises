package PracticeOutofClass;

import org.w3c.dom.ls.LSOutput;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("It's hot outside.");
        }
        System.out.println("---------------------");

        String[] colors = {"Red", "Blue", "Green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }
        String[][] Morecolors = {{"Red", "Blue", "Green"},
                {"Cyan", "Magenta", "Turquoise"}
        };
        for (int  row = 0; row < 2; row++)
            for (int column = 0; column < 3; column++) {
                System.out.println(Morecolors[row][column]);
            }
    }

}
