package Level2;

public class Area {
      public int calculateArea(int l ,int b){
        return l * b;
      }
      public int calculateArea(int side){
         return side* side;
      }
      public int calculateArea(int radius , boolean isCircle){
         return (int) Math.PI * radius * radius;
      }

    public static void main(String[] args) {
        Area square = new Area();
        System.out.println(square.calculateArea(25));
        Area Circle = new Area();
        System.out.println(Circle.calculateArea(10,true));
        Area Rectangle = new Area();

        System.out.println(Rectangle.calculateArea(10,20));
    }
}
