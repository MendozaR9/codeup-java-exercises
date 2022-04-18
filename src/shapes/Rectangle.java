package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    int length;
//    private int width;

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void setLength(int length) {
    this.length = length;
    }

    @Override
    void setWidth(int width) {
    this.width = width;
    }

    @Override
    public double getPerimeter() {
        return super.getLength()*super.getWidth();
    }

    @Override
    public double getArea() {
        return (2* super.getLength())+(2*super.getWidth());
    }

//    public Rectangle(int l, int w){
//        this.length = l;
//        this.width=w;
//    }
//
//    public int getArea(){
//        return this.length* this.width;
//    }
//    public int getPerimeter(){
//        return (2* this.length)+(2*this.width);
//    }
}
