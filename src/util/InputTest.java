package util;

public class InputTest {
    public static void main(String[] args) {
        Input anotherInput = new Input();

        System.out.println(anotherInput.getString());
        System.out.println(anotherInput.yesorno());
        System.out.println(anotherInput.getInt());
        System.out.println(anotherInput.getDouble());
        System.out.println(anotherInput.getDouble(5,7));

    }
}
