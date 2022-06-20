public class Employee extends Person{
    private String[] responsibilities;

    public Employee(String name) {
        super(name);
    }
    public Employee(String name, String[] responsibilities){
        super(name);
        this.responsibilities = responsibilities;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void sayHello(){
        System.out.println("No time to talk, I'm on the clock");
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Stephen");
        System.out.println(emp.getName());
        emp.sayHello();
        String[] StephenDuties = {"Facilitate meetings",  "Make coffee for the team", "Manage Calendar"};
        emp.setResponsibilities(StephenDuties);
        System.out.println(". Stephen does a lot for this office, including but not limited to:");
        for(String duty : emp.getResponsibilities()){
            System.out.println(duty);
        }
        System.out.println("break -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Person Sue = new Employee("Sue");
        Sue.sayHello();
    }
}
