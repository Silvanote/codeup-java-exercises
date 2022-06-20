public class Employee extends Person{


    public Employee(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Stephen");
        System.out.println(emp.getName());
    }
}
