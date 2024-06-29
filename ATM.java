import java.util.*;
public class ATM {
    Bank_account account = new Bank_account(1000);
    Scanner in = new Scanner(System.in);
    public void checkBalance() {
        System.out.println("Your Balance Amount : "+account.getBalance());
    }
    public void Interface()
    {
        Double amount;
        System.out.println("\nWelcome to the ATM");
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the Amount to Deposit:");
                    amount = in.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the you want Withdraw:");
                    amount = in.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        
        ATM a = new ATM();
        a.Interface();
    }
}
