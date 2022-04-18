package shapes;

import javax.swing.*;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myshape;
        myshape = new Rectangle(4,5);
        myshape = new Square(4);
        System.out.println(myshape.getArea());
        System.out.println(myshape.getPerimeter());

//        Rectangle box1 = new Rectangle(4 ,5);
//        System.out.println(box1.getPerimeter()); /*expect 18*/
//        System.out.println(box1.getArea()); /*expect 20*/

    }
}
