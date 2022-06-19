import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        // When I ran the original code, the output was [I@d0e937d2. Arrays to String is necessary for the code to be human read.

        Person[] people = new Person[3];
        Arrays.fill(people, new Person("Justin"));
        people[0] = new Person("Scott");
        people[1] = new Person("Michael");
        people[2] = new Person("Sam");
        for (Person person : people) {
            person.sayHello();
        }

//        Person[] staff = new Person[3];
//        staff[0] = people[0];
//        staff[1] = people[1];
//        staff[2] = people[2];
//        System.out.println(Arrays.equals(people, staff));

        System.out.println(people.toString());

    }
}
