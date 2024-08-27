package Level1;

public class Circle {
    double radius;

    Circle(double r){
        this.radius = r;
    }

    void AreaOfaCircle(){
        double pie = 3.14;
        System.out.println("Area Of a Circle is :" + pie * Math.pow(radius,2) );
    }

    void Circumference(){
        double pie = 3.14;
        System.out.println("Circumference Of a Circle is :" +(float)(2 * pie* radius));
    }

    public static void main(String[] args) {
        Circle c =  new Circle(5.0);
        c.AreaOfaCircle();
        c.Circumference();
    }
}

