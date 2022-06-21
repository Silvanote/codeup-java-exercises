package grades;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<Integer>
                grades = new ArrayList<>();
        grades.add(85);    // adding an element
        grades.add(90); // specifying an index
        grades.add(0, 100);
        System.out.println(grades);
    }
}