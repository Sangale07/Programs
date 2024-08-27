package Level2;

public class ArithmaticSum {
    int sum(int a , int b){
        return a+ b;
    }
    int sum (int a ,int b ,int c){
        return a+ b + c;
    }
    int sum (int a, int b , int c ,int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmaticSum cal = new ArithmaticSum();
        System.out.println(cal.sum(10,20));
        System.out.println(cal.sum(10,20,30,40));
        System.out.println(cal.sum(10,50,60));
    }
}
