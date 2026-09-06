public class BankAccount {

    private String holderName;
    private int accountNum;
    private double balance;

    public BankAccount(String holderName, int accountNum, double balance) {
        this.holderName = holderName;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println(amount + " withdrawal Successful");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

}
