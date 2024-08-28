package Level3;

import java.util.Scanner;

public class MethodWithoutReturntype {
    public void Area(int l , int b){
        System.out.println("Area of Rectangle "+ l * b);
    }

    public static void main(String[] args) {
        MethodWithoutReturntype rec = new MethodWithoutReturntype();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth:");
        int Breadth = sc.nextInt();
        rec.Area(length ,Breadth);

    }
}
