import java.util.Scanner;

public class BankAccount {
    static double rateOfInterest = 5.0; // annual percentage

    long accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateSimpleInterest(double years) {
        return (balance * rateOfInterest * years) / 100.0;
    }

    public double finalBalanceAfterInterest(double years) {
        return balance + calculateSimpleInterest(years);
    }

    public void printDetails(double years) {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Initial Balance: %.2f\n", balance);
        System.out.printf("Rate of Interest: %.2f%%\n", rateOfInterest);
        System.out.printf("Simple Interest for %.2f years: %.2f\n", years, calculateSimpleInterest(years));
        System.out.printf("Final Balance: %.2f\n", finalBalanceAfterInterest(years));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter current balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter time in years for interest calculation: ");
        double years = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, bal);
        System.out.println();
        acc.printDetails(years);

        sc.close();
    }
}
