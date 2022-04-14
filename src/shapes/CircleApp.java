package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        do {
        Circle circle = new Circle(input.getDouble("Give me the radius: "));

        System.out.println("Do You Want to Continue?");
        }while (input2.yesNo());
    }
}
