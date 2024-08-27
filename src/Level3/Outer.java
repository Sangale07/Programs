package Level3;

public class Outer {
    static class Inner{
        void show(){
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Inner();
        inner.show();
    }
}
