package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int l, int w){
        this.length = l;
        this.width=w;
    }

    public int getArea(){
        return this.length* this.width;
    }
    public int getPerimeter(){
        return (2* this.length)+(2*this.width);
    }
}
