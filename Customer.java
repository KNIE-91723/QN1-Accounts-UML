import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String name;
    private String customerId;
    
    private List<Account> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (account != null) {
            this.accounts.add(account);
        }
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    //Calculates and returns the sum of the balances of all the customer's accounts.
     
    public double totalWorth() {
        double total = 0.0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}