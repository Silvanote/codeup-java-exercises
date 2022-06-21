package PracticeOutofClass;

public class StingtoInt {
    public static void main(String[] args) {
        String s = "102";
        String a = "age: 47";
        a = a.replaceAll("\\D+","");

        int n = Integer.parseInt("3");

//        System.out.println(Integer.parseInt(s) + 4);
        System.out.println(Integer.parseInt(s) + 4);
        System.out.println(n + 4);



    }
}
