import java.util.Scanner;

// Parent Class
class Bank {
    static double rateOfInterest = 6.5;
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }
}

// Child Class
class SavingsAccount extends Bank {
    long accountNumber;
    String accountHolder;
    double balance;

    public SavingsAccount(String bankName, long accNo, String holder, double bal) {
        super(bankName);
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = bal;
    }

    public void calculateInterest(int years) {
        double simpleInterest = (balance * rateOfInterest * years) / 100;
        double finalBalance = balance + simpleInterest;

        System.out.println("\nBank: " + bankName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Final Balance: " + finalBalance);
    }
}

public class BankInterestSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bank = sc.nextLine();

        System.out.print("Enter account number: ");
        long accNo = sc.nextLong();

        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String holder = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int yrs = sc.nextInt();

        SavingsAccount sa = new SavingsAccount(bank, accNo, holder, bal);
        sa.calculateInterest(yrs);

        sc.close();
    }
}
