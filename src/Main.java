import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 0.00;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = deposit(sc, balance);
                    break;
                case 2:
                    balance = withdraw(sc, balance);
                    break;
                case 3:
                   checkBalance(balance);
                    break;
                case 4:
                    System.out.println("Thank you for Banking with us");
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        } while(choice != 4);

    }

    static void showMenu() {
        System.out.println("===== BANKING APPLICATION =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
    }

    static double deposit(Scanner sc, double balance){
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        if(depositAmount > 0) {
            balance += depositAmount;
            System.out.println(depositAmount + " deposited Successfully");
            System.out.println("Current Balance: " + balance);
        } else if (depositAmount <= 0) {
            System.out.print("Invalid Amount");
        }

        return balance;
    }

    static double withdraw(Scanner sc, double balance){
        System.out.print("Enter withdrawal Amount: ");
        int withdrawalAmount = sc.nextInt();

        if(withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.println( withdrawalAmount + " Withdrawal Successful");
        } else if (withdrawalAmount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    static void checkBalance(double balance){
        System.out.println("Balance Selected");
        System.out.println("Current Balance: " + balance);
    }
}