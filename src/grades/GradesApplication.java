package grades;

import java.util.HashMap;
import java.util.Scanner;

//keep it simple with and import hashmap
public class GradesApplication {

    public static void main(String[] args) {
            HashMap<String, Student> students = new HashMap<>();

        Student Tristan = new Student("Tristan");
        Tristan.addGrade(35);
        Tristan.addGrade(100);
        Tristan.addGrade(80);

        Student Lana = new Student("Lana");
        Lana.addGrade(98);
        Lana.addGrade(85);
        Lana.addGrade(80);

        Student Oscar = new Student("Oscar");
        Oscar.addGrade(99);
        Oscar.addGrade(95);
        Oscar.addGrade(90);

        Student Gloria = new Student("Gloria");
        Gloria.addGrade(40);
        Gloria.addGrade(65);
        Gloria.addGrade(81);

        students.put("Tristans", Tristan);
        students.put("Lanas",Lana);
        students.put("Oscars",Oscar);
        students.put("Glorias",Gloria);

        boolean Answer = true;

        while (Answer) {
            System.out.printf("Pick a student from the list above (Tristan, Lana, Oscar)?\n");
            students.forEach((ID, student) -> System.out.println(".."+ ID +" .." ));
            Scanner StudentChoiceInput = new Scanner(System.in);
            String answer = StudentChoiceInput.nextLine();

            if (students.containsKey(answer)) {
                Student lookup = students.get(answer);
                System.out.printf("Name-( %s )- GitHub Username- %s  Current Average is- ((%f))", lookup.getName(), answer, lookup.getGradeAverage());
            }else {
                System.out.format("no student found with username (( %s))",answer);
            }

            System.out.println("\nWould you like to try again? Y/N");
            answer = StudentChoiceInput.nextLine();

            if(answer.equalsIgnoreCase("n")) {
                Answer = false;
            }
        }



    }
}
