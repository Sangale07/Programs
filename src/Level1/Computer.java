package Level1;

public class Computer {
    String Processor;
    int storage;
    int ram;

    Computer(String processor , int storage , int ram){
        this.Processor =processor;
        this.storage = storage;
        this.ram = ram;

    }
    double calculatePrice(){
        double price;
        if(Processor == "i9"){
            price = 5000;
        }
        else if(Processor == "i7"){
            price = 4500;
        }
        else if(Processor == "i5"){
            price = 3500;
        }
        else{
            price = 3000;
        }


        if(ram > 16){
            price = price + 2000;
        } else if (ram >= 12) {
           price = price + 1500;
        }
        else{
            price += 1000;
        }

        if(storage >= 1000){
            price += 1000;
        }
        else{
            price += 800;
        }

        return price;
    }

    void printData(){
        System.out.println("Processor:" + Processor);
        System.out.println("Storage:" + storage);
        System.out.println("Ram:" + ram);
        System.out.println("Price:"+ calculatePrice());
    }

    public static void main(String[] args) {
        Computer comp1 = new Computer("i7",1000,32);
        comp1.printData();
    }

}
