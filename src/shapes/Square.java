package shapes;

public class Square extends Rectangle{

    public Square(int sides){
        super(sides,sides);

    }

    @Override
    public int getArea() {
        return (int) Math.pow(super.length, 2);
    }

    @Override
    public int getPerimeter() {
        return super.length*10;
    }



}
