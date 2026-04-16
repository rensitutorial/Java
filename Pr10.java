class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }
}

public class Pr10 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rency", 10000);
        BankAccount acc2 = new BankAccount("John", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        BankAccount.updateInterestRate(7.0);

        System.out.println("\nAfter Updating Interest Rate:\n");

        acc1.displayInterest();
        acc2.displayInterest();
    }
}

//output: Account Holder: Rency
//Balance: 10000.0
//Interest Earned: 500.0
//Account Holder: John
//Balance: 20000.0
//Interest Earned: 1000.0

//After Updating Interest Rate:

//Account Holder: Rency
//Balance: 10000.0
//Interest Earned: 700.0
//Account Holder: John
//Balance: 20000.0
//Interest Earned: 1400.0
