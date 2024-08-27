package Level3;

public class BankAcc {
   double principal;
   double rate;
   int time;

    BankAcc(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    class Interest {
        double calculateInterest() {
            return (principal * rate * time) / 100;
        }
    }

    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000, 5, 2);
        BankAcc.Interest interest = account.new Interest();
        System.out.println("Interest: " + interest.calculateInterest());
    }
}
