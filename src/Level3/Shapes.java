package Level3;

public class Shapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.input();
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle();
        rectangle.input();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
interface Shape{
    void input();
    double area();


}
class Circle implements Shape {
    private double radius;

    @Override
    public void input() {
        this.radius = 5;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    @Override
    public void input() {
        this.length = 4;
        this.breadth = 3;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

