import java.util.Scanner;

public class Employee {
    static double companyBonusPercent = 10.0; // percentage
    int id;
    String name;
    double basicSalary;
    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double calculateGrossSalary() {
        double bonus = basicSalary * companyBonusPercent / 100.0;
        double deductions = basicSalary * 12.0 / 100.0; // example deduction (e.g., PF)
        return basicSalary + bonus - deductions;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Basic Salary: %.2f\n", basicSalary);
        System.out.printf("Company Bonus (%%): %.2f\n", companyBonusPercent);
        System.out.printf("Gross Salary: %.2f\n", calculateGrossSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(id, name, basic);
        System.out.println();
        emp.printDetails();

        sc.close();
    }
}
