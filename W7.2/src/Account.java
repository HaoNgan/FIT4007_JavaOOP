public class Account {
    private double balance;
    private String acct_id;

    public Account(double initalBalance, String id) {
        balance = initalBalance;
        acct_id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public void deposit(double amount) {
        balance += amount;

    }
}

