package Level3;

public class Calculator extends  AbCalculator {

    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return a-b;
    }

    @Override
    int mul(int a, int b) {
        return a*b;
    }

    @Override
    int div(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        Calculator cal =  new Calculator();
        System.out.println(cal.add(10,20));
        System.out.println(cal.sub(20,10));
        System.out.println(cal.mul(10,5));
        System.out.println(cal.div(25,5));
    }
}
abstract class AbCalculator{
    abstract int add(int a ,int b);
    abstract int sub(int a ,int b);
    abstract int mul(int a ,int b);
    abstract int div(int a , int b);


}
