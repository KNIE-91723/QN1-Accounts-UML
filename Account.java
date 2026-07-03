// Account.java
public abstract class Account implements Statement {
    // Visibility markers: # protected, - private
    protected String accNo;
    protected double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Abstract method as required by the design
    public abstract void withdraw(double amount);

    public double getBalance() {
        return this.balance;
    }

    public String getAccNo() {
        return this.accNo;
    }

    @Override
    public String generateStatement() {
        return "Account Number: " + accNo + " | Current Balance: UGX " + String.format("%.2f", balance);
    }
}