class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double rate = 4.0;

    double calculateInterest() {
        return (balance * rate) / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 6.5;
    int years;

    void setYears(int y) {
        years = y;
    }

    double maturityAmount() {
        return balance + (balance * rate * years) / 100;
    }
}

public class Pr14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("101", "Rency", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("102", "Rahul", 20000);
        fd.setYears(3);
        fd.checkBalance();
        System.out.println("Maturity Amount: " + fd.maturityAmount());
    }
}

//output: Balance: 10500.0
//Saving Interest: 420.0
//Balance: 20000.0
//Maturity Amount: 23900.0
