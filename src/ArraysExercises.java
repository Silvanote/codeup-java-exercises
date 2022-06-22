import java.util.Arrays;

public class ArraysExercises {

    public static Person [] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
// When I ran the original code, the output was [I@d0e937d2. Arrays to String is necessary for the code to be human read.

        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
//        Arrays.fill(people, new Person("Justin"));
        people[0] = new Person("Scott");
        people[1] = new Person("Michael");
        people[2] = new Person("Sam");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("Use this to break in between =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    Person Justin = new Person("Justin");
        people = addPerson(people, Justin);
        for(Person person : people){
            System.out.println(person.getName());
        }
//        }

//        Person[] staff = new Person[3];
//        staff[0] = people[0];
//        staff[1] = people[1];
//        staff[2] = people[2];
//        System.out.println(Arrays.equals(people, staff));

//        System.out.println(people.toString());

    }
}
