package Level1;

public class Shirt {
    String size;
    String color;
    double price;

    Shirt(String size , String color , double price){
        this.size = size;
        this.color= color;
        this.price = price;
    }

    double discount(){
        double dis;

        if(size == "XL"){
            dis = 0.25;
        }
        else if(size == "L"){
            dis = 0.20;
        }
        else if(size == "M"){
            dis =  0.15;
        }
        else{
            dis = 0.18;
        }

        return price * dis;

    }
    double calculatePrice(){
        return price - discount() ;
    }
    void printData(){
        System.out.println("Size :"+ size);
        System.out.println("Color:"+ color);
        System.out.println("price:" + price);
        System.out.println("Discount:" + discount());
        System.out.println("final price:"+ calculatePrice());
    }

    public static void main(String[] args) {
        Shirt sh = new Shirt("L" , "white" , 300);
        sh.printData();
    }
}
