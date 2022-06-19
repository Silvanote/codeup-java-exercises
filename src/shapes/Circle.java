package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
//Use the methods from the cirriculum to get the formulas. Circle/radius/circumference

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

        public double getCircumference () {
            return 2 * Math.PI * (this.radius);
        }
    }
