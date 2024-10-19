public class Main {
    public static void main(String[] args) {
        Bank account1 = new Bank();
        Bank account2 = new Bank();

        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());
        System.out.println(Bank.OVERDRAFT_FREE);
        Bank.OVERDRAFT_FREE = 0.4;
        Bank.showInfo();
    }
}