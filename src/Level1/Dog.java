package Level1;

public class Dog {
    String Breed;
    int age;
    double weight;

    Dog(String Breed , int age, double weight){
        this.Breed = Breed;
        this.age = age;
        this.weight = weight;
    }

    int humanyearsage(){
        return age * 6;
    }

    void printDogDetails(){
        System.out.println("Breed:" + Breed);
        System.out.println("Age:" + age);
        System.out.println("Age(in human years):"+ humanyearsage());
        System.out.println("Weight:" + weight);

    }

    public static void main(String[] args) {
        Dog d = new Dog("Husky" , 10 , 35);
        d.printDogDetails();
    }
}
