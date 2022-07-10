package grades;

    public class StudentTest {
        public static void main(String[] args) {
            Student Juan= new Student("Juan");
            Student Nora = new Student("Nora");
            Juan.addGrade(100);
            Juan.addGrade(50);
            Juan.addGrade(65);
            Nora.addGrade(75);
            Nora.addGrade(65);
            Nora.addGrade(95);
            System.out.println(Juan.getName());
            System.out.println(Juan.getGradeAverage());
            System.out.println(Nora.getName());
            System.out.println(Nora.getGradeAverage());

        }
    }

