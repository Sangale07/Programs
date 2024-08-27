package Level2;

import java.util.Scanner;

public class Calculator {
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();

        int ans = add(a, b);
        System.out.println("the Result of the Addition is :"+ans);

    }

    int add(int a, int b){
      return a+b;
    }

    public static void main(String[] args) {
        Calculator cal =  new Calculator();
        cal.input();
    }
}
