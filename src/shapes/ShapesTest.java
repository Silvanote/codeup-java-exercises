package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(9,10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~");
        myShape = new Square(11);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}