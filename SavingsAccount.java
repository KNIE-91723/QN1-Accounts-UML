
public class SavingsAccount extends Account {
    private double interestRate; // e.g., 0.05 for 5%

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        // Must refuse any request that takes the balance below zero
        if (amount > 0 && (this.balance - amount) >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("Transaction Denied: Insufficient funds in Savings Account.");
        }
    }

    public void addInterest() {
        // Adds rate% of the balance to the balance
        double interest = this.balance * this.interestRate;
        deposit(interest);
    }
}