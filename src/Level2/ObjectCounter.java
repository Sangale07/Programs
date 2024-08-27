package Level2;

public class ObjectCounter {
    public static int counter= 0;
    public ObjectCounter(){
        counter++;
    }

    public static int getObjectCount(){
        return counter;
    }

    public static void main(String[] args) {
        ObjectCounter obj1= new ObjectCounter();
        ObjectCounter obj2= new ObjectCounter();
        ObjectCounter obj3= new ObjectCounter();
        ObjectCounter obj4= new ObjectCounter();

        System.out.println(ObjectCounter.getObjectCount());
    }
}
