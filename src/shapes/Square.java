package shapes;

public class Square extends Quadrilateral{

    public Square(int length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return Math.pow(super.getLength(),2);
    }

    @Override
    public double getArea() {
        return super.getLength()*2;
    }

//    public Square(int sides){
//        super(sides,sides);
//
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(super.length, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return super.length*10;
//    }

}
