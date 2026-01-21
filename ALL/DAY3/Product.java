import java.util.Scanner;

public class Product {
    static double taxPercentage = 12.0; // tax percentage
    int productId;
    String productName;
    double price;
    int quantity;
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotalCost() {
        return price * quantity;
    }
    public double calculateTaxAmount() {
        return calculateTotalCost() * taxPercentage / 100.0;
    }
    // Example discount rules: >10000 -> 10%, >5000 -> 5%, otherwise 0
    public double calculateDiscount() {
        double total = calculateTotalCost();
        if (total > 10000) {
            return total * 0.10;
        } else if (total > 5000) {
            return total * 0.05;
        }
        return 0.0;
    }

    public double calculateFinalBill() {
        return calculateTotalCost() + calculateTaxAmount() - calculateDiscount();
    }
    public void printBillDetails() {
        double total = calculateTotalCost();
        double tax = calculateTaxAmount();
        double discount = calculateDiscount();
        double finalBill = calculateFinalBill();
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Unit Price: %.2f\n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: %.2f\n", total);
        System.out.printf("Tax (%.2f%%): %.2f\n", taxPercentage, tax);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Bill Amount: %.2f\n", finalBill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);
        System.out.println();
        p.printBillDetails();
        sc.close();
    }
}
