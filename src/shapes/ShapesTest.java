package shapes;

import javax.swing.*;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4 ,5);
        System.out.println(box1.getPerimeter()); /*expect 18*/
        System.out.println(box1.getArea()); /*expect 20*/
        Rectangle box2 = new Square(5);
            System.out.println(box2.getPerimeter()); /*expect 20*/
        System.out.println(box2.getArea()); /*expect 25*/
    }
}
