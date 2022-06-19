package PracticeOutofClass;
class Demo
{

        int empId;
        String empName;

        //parameterized constructor with two parameters
        Demo (int id, String name){
            this.empId = id;
            this.empName = name;
        }
        void info(){
            System.out.println("Id: "+empId+" Name: "+empName);
        }

        public static void main(String args[]){
            Demo obj1 = new Demo(10245,"Juan");
            Demo obj2 = new Demo(92232,"Umbriel");
            obj1.info();
            obj2.info();
        }
    }
