package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        Input input3 = new Input();
        input.yesNo();
        System.out.println("Enter a number between 1 and 10");
        input2.getInt(1,10);
        System.out.println(input3.getInt("Enter a int:"));
    }

}
