package Level1;

public class Television {
    String Brand;
    double price;
    double size;

    Television(String b, double s, double p ){
        this.Brand = b;
        this.price = p;
        this.size = s;
    }

    double discount(){
        double dis;
        if(size >65){
            dis =  0.25;
        }
        else if(size > 45){
            dis =  0.15;
        }
        else {
            dis =  0.10;
        }
        return dis * price;
    }

    double CalulateDiscountedPrice(){
        return price - discount();
    }

    void printDetails(){
        System.out.println("Brand:" + Brand);
        System.out.println("Size:"+ size);
        System.out.println("Price:"+price);
        System.out.println("Discount"+ discount());
        System.out.println("Final Price :" + CalulateDiscountedPrice());
    }

    public static void main(String[] args) {
        Television tv = new Television("Samsung" , 55000 ,60);
        tv.printDetails();
    }
}
