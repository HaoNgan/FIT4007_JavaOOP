 public class OverdraftAccount extends Account {
     private double odLimit;
     private double overdraft;
     private double availableBalance;

     public OverdraftAccount(double initialBalance, String id, double limit) {
         super(initialBalance, id);
         odLimit = limit;
         overdraft = 0;
         availableBalance = initialBalance + limit;
     }

     public double getOdLimit() {
         return odLimit;
     }

     public void setOdLimit(double odLimit) {
         this.odLimit = odLimit;
     }

     public double getAvailableBalance() {
         return availableBalance;
     }

     public void setAvailableBalance(double availableBalance) {
         this.availableBalance = availableBalance;
     }

 }