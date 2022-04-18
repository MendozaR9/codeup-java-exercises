package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    //constructor
    public Quadrilateral(int l, int w){
        this.length = l;
        this.width=w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength(int length);

    abstract void setWidth(int width) ;
}
