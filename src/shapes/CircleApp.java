package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean keepMakingCircles = true;
        while (keepMakingCircles) {
            Input in = new Input();
            System.out.println("Should work to make a circle in this print line!");
            Circle circle = new Circle(in.getDouble());
            System.out.println("Circle is done and now to input Math formula");
            System.out.printf("Input circle circumference formula %f?%n", circle.getCircumference());
            System.out.printf("Area of a circle via the following properties. %f?%n", circle.getArea());
            System.out.println("Accomplished the required actions");
            System.out.println("Would like to still play Java?");
            in.clear();
           keepMakingCircles = in.yesorno();
            if (keepMakingCircles) {
                System.out.println();
            } else {
                System.out.println();
            }
        }
            System.out.println("Bonus couldn't do so needed intstructor help.");
        }
    }
