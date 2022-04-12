package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("Give me the radius: ");
        Circle circle = new Circle(input.getDouble());

        System.out.println(circle);
    }
}
