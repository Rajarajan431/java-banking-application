import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ACCOUNT REGISTRATION ====");

        System.out.println("Enter account holder name: ");
        String holderName = sc.nextLine();

        System.out.println("Enter the account number: ");
        int accountNum = sc.nextInt();

        System.out.println("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.println("=== ACCOUNT DETAILS ====");
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Initial Balance: " + balance);

    }
}