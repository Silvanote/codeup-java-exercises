import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;

        public String firstName;

        public String sayHello2() {
            return String.format("Hello from %s %s!", firstName);
        }



    //TODO: return the person's name

    public static void main(String[] args) {
        Person Juan = new Person();
        Juan.firstName = "Juan";
        System.out.println(Juan.sayHello2());
    }


    //TODO: change the name field to the passed value

    public void sayHello(){
        System.out.println(sayHello2());
    }
}
//TODO: print a message to the console using the person's name