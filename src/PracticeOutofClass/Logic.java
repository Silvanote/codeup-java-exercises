package PracticeOutofClass;

public class Logic {
    //  || OR
    // && AND
    // !NOT
    public static void main(String[] args) {

        boolean a = true || true;
        boolean b = true && false;
        boolean c = !(true || false);
        int d = 5;
        int e = 6;
        boolean f =  d > e;
        boolean isSunny = true;
        System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=---=-=-=-=-=-=-=-=-=-=-=-");
        if (d < e && isSunny){
            System.out.println("today is gonna be sunny!");
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
    }
}
