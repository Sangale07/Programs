package Level3;

public class withoutParameter {
    public static void main(String[] args) {
      Area rec = new Area();
        System.out.println(rec.area());
    }

}
class Area{
    int area(){
        int l = 10;
        int b = 10;
        return l*b;
    }
}