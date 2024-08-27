package Level1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1 , "Rushikesh" , 40000);
        emp.printEmpDetail();
    }
}

class Employee {
    int id;
    double Salary;
    String name;

    Employee(int id, String name, double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    double YearlySalary() {
        return 12 * Salary;
    }

    void printEmpDetail() {
        System.out.print(name + " " + YearlySalary());
    }
}
