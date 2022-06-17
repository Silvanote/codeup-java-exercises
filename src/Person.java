public class Person {
    private String name;

    //
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' + '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        //TODO: return the person's name
        return name;
    }

//    public String setName() {
////TODO: change the name field to the passed value
//        return name;
//    }

    public void setName(String Name) {
        //TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, my name is %s", name);
    }
//TODO: print a message to the console using the person's name

    public static void main(String[] args) {
        Person juan = new Person("Juan");
        juan.setName("Juan");
        juan.sayHello();
    }
}
