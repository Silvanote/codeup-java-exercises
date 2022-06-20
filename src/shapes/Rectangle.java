package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        System.out.println("The rectangle's area!");
        return length * width;
    }

    public int getPerimeter() {
        System.out.println("The rectangle's perimeter");
        return (2 * length) + (2 * width);
    }
}

