public class Bank {
    private double balace;
    private int accountNumber;
    private static int lastAssigne = 1000;
    public static double OVERDRAFT_FREE = 0.02;

    public Bank(){
        lastAssigne++;
        accountNumber = lastAssigne;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public static void showInfo() {
        System.out.println("Account number" + accountNumber);
        System.out.println("Balace" + balace);
        System.out.println("Overdraft fee" + OVERDRAFT_FREE);
    }
}
