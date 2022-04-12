package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        do {
        System.out.print("Give me the radius: ");
        Circle circle = new Circle(input.getDouble());

        System.out.println("Do You Want to Continue?");
        }while (input2.yesNo());
    }
}
