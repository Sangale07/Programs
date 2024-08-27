package Level1;

public class Furniture {
     String type;
     String material;
     double price;


    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    double discount(){
        double dis ;
        if(material == "wood"){
           dis = price * 0.20;
        }
        else if(material == "metal"){
            dis = price * 0.15;
        }
        else{
            dis = price * 0.25;
        }

        return dis;
    }
    double calculatePrice(){
        return price - discount();
    }
    void printData(){
        System.out.println("Furniture Type:" + type);
        System.out.println("Furniture Material:"+ material);
        System.out.println("Furniture price:" + price);
        System.out.println("Discount:"+ discount());
        System.out.println("Final Price:"+ calculatePrice());
    }

    public static void main(String[] args) {
        Furniture f1 = new Furniture("Chair" , "wood" , 2500);
        f1.printData();
    }
}
