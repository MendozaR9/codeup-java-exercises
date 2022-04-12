package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        input.yesNo();
        System.out.println("Enter a number between 1 and 10");
        input2.getDouble(1,10);
    }

}
