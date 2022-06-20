package shapes;

public class Square {
    package shapes;

    public class Square extends Rectangle{
        protected int side;

        public Square(int side) {
            super(side, side);
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
            this.width = side;
            this.length = side;
        }

        public void setLength(int side) {
            setSide(side);
        }

        public void setWidth(int side) {
            setSide(side);
        }

        public int getPerimeter() {
            System.out.println("The square's perimeter!");
            return 4 * side;
        }

        public int getArea() {
            System.out.println("The square's area!");
            return side * side; // Math.pow(side,2);
        }
    }

}
