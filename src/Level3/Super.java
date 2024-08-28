package Level3;

public class Super {
    public static void main(String[] args) {
        Subclass obj = new Subclass("Rushikesh" , "Sangale");
    }
}
class SuperClass{
    String superString;
    SuperClass(String str){
        this.superString = str;
        System.out.println(superString);
    }
}
class Subclass extends SuperClass{
    String subString;
    Subclass(String str , String substr){
        super(substr);
        this.subString = str;
        System.out.println(str);


    }
}
