package Level2;

public class AreaCalculator {
    public Triangle calculateTriangleArea(Triangle tri){
        double area = 0.5 * tri.length * tri.base;
        System.out.println("Area :" + area);
        return  tri;
    }
    public Rectangle calculateRectangleArea(Rectangle rec){
        double area =  rec.length * rec.bredth;
        System.out.println("Area :" + area);
        return  rec;
    }

    public static void main(String[] args) {
         Triangle tri =  new Triangle(15,25);
         Rectangle rec = new Rectangle(10,20);

         AreaCalculator obj = new AreaCalculator();

         obj.calculateRectangleArea(rec);
         obj.calculateTriangleArea(tri);
    }
}
class Triangle{
    int length;
    int base;

    Triangle(int l , int b){
        this.length = l;
        this.base = b;

    }


}
class Rectangle{
    int length;
    int bredth;

    Rectangle(int l , int b){
        this.length = l;
        this.bredth = b;
    }

}
