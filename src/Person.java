import org.w3c.dom.ls.LSOutput;
//TODO: return the person's name
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//TODO: return the person's name

    public String getName() {
//TODO: change the name field to the passed value
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("hello, my name is %s,", name);
    }
//TODO: print a message to the console using the person's name
}
public static void main(){

}

//    public void setName(String name) {
//        this.name = name;
//    }
//}
