import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Harry", 12345, 1000);
        //System.out.println("Balance: " + account.getBalance());

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = sc.nextDouble();

                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account.checkBalance();
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

}