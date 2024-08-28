package Level3;

public class Swap_Objects {
    String name ;
    int Id;

    Swap_Objects(int id , String name){
        this.name = name;
        this.Id = id;
    }

    public static void main(String[] args) {
        Swap_Objects emp1 = new Swap_Objects(1, "Rushikesh");
        Swap_Objects emp2 =  new Swap_Objects(2, "Irfan");

        System.out.println("Before Swapping");
        System.out.println(emp1.name + " "+emp1.Id);
        System.out.println(emp2.name + " "+emp2.Id);

        Swap(emp1,emp2);

        System.out.println("After Swapping");
        System.out.println(emp1.name + " "+emp1.Id);
        System.out.println(emp2.name + " "+emp2.Id);

    }
    public static void Swap(Swap_Objects emp1 , Swap_Objects emp2){
        String tempName = emp1.name;
        int tempId = emp1.Id;

        emp1.name = emp2.name;
        emp1.Id = emp2.Id;

        emp2.name = tempName;
        emp2.Id = tempId;
    }
}
