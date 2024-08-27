package Level1;

public class BankAccount {
    public static void main(String[] args) {
        Account ac1 = new Account(1,25000);
        ac1.deposite(20000);
        ac1.WithDraw(3000);

        ac1.deposite(2000);
        ac1.WithDraw(100000);
        System.out.println(ac1.Balance());
    }
}
class Account{
    double Amount;
    int AccNo;

    Account( int AccNo,double  Amount ){
        this.AccNo= AccNo;
        this.Amount = Amount;
    }

    void deposite(double amount){
        Amount = Amount + amount;
    }

    void WithDraw(double amount){
        if(amount< Amount ){
            System.out.println("successfully Withdraw" + amount);
            Amount= Amount - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
    double Balance(){
        return Amount;
    }

}
