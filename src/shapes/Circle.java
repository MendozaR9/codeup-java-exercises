package shapes;

public class Circle {
    private double radius;

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
    }

    public Circle(double radius){
        System.out.println("A Circle is created");
        this.radius = radius;
        System.out.println("The Area: "+getArea());
        System.out.println("The Circumference: "+getCircumference());
    };
    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    };

    public double getCircumference(){
        return (2*Math.PI)*this.radius;
    };

}
