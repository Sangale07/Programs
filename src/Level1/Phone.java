package Level1;

public class Phone {
    String make ;
    String model;
    int storage;

    public Phone(String make, String model , int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage ;

    }

    int priceOfPhone(){
        int price;
        switch (make.toLowerCase()){
            case "Apple" :
                price = 30000;
            case "Samsung" :
                price = 25000;
            default:
                price = 20000;
        }

        if(storage >= 128){
            price += 5000;
        }
        else{
            price += 2000;
        }
        return price;
    }

    void printDetails(){
        System.out.println("Make :" + make);
        System.out.println("model :" + model);
        System.out.println("Storage:" + storage);
        System.out.println("Price:"+ priceOfPhone());
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("Poco" , "X3" , 128);
        p1.printDetails();
    }


}
