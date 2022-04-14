package shapes;

import util.Input;

public class Square extends Rectangle{
private int side;
    public Square(int sides){
        super(sides,sides);
        this.side = sides;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(this.side, 2);
    }

    @Override
    public int getPerimeter() {
        return this.side*4;
    }

//    public static void main(String[] args) {
//        Input input = new Input();
//        Square square = new Square(input.getInt("Enter the sides length: "));
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//    }

}
