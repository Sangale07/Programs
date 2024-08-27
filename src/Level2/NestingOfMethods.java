package Level2;

public class NestingOfMethods {
    int length;
    int breadth;
    int height;

    NestingOfMethods(int l , int br ,int h){
        this.length = l;
        this.breadth = br;
        this.height= h;
    }
    public int perimeter(){
        int perimeter = 2*(length + breadth);
        System.out.println("Perimeter is :" + perimeter);
        return perimeter;
    }
    public double area() {

        perimeter();
        double area = length * breadth;
        System.out.println("Area is :" + area);
        return area;
    }

    public double volume() {

        area();
        double volume = length * breadth * height;
        System.out.println("Volume is: " + volume);
        return volume;
    }

    public static void main(String[] args) {
        NestingOfMethods obj = new NestingOfMethods(10,20,10);
        obj.volume();
    }

}
