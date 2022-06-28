package PracticeOutofClass;

public class GetterNSetter {

    String name;
    int age;

    public static void main(String[] args) {
    GetterNSetter a = new GetterNSetter();

//    a.age = 34;
//    a.name = "Pablo";

    a.printDetails();

        System.out.println(a.age);
        System.out.println(a.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void printDetails(){
        System.out.println(name + ", "  + age);
    }
}
//
//        GetterNSetter a = new GetterNSetter();
//
//        a.sayHappyBirthday("Alex");
//    }
//
//    public static void sayHappyBirthday(String name){
//        System.out.println("Happy birthday" + name);
//    }
//}
