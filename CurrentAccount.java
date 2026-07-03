public class CurrentAccount extends Account {
    private double overdraftLimit; // Stored as a positive value representing the max allowed depth

    public CurrentAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Withdraw may take balance negative but only as far as the overdraft limit
        if (amount > 0 && (this.balance - amount) >= -overdraftLimit) {
            this.balance -= amount;
        } else {
            System.out.println("Transaction Denied: Overdraft limit exceeded.");
        }
    }
}