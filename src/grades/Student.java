package grades;
import java.util.ArrayList;

//Base for my getters and setters
public class Student {
    private static String name;
    private static ArrayList<Integer> grades;

//String for name and grades
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns this.student's name
    public String getName() {
        return this.name;
    }

    //this.grade add function / method
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    //test the inputs and runs the java methods with psvm in StudentTest.java class.  This is just the function that formats the data requirements.
    public double getGradeAverage() {
        int gradesAdded = 0;
        //tried double or float but brings in too many decimal points
        for ( int grade : this.grades) {
            gradesAdded += gradesAdded + grade;
        }
        // remember .length does not work and utilize .size instead when using java
        return gradesAdded / this.grades.size();
    }
}