import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        int choice;
        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.checkBalance();
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
