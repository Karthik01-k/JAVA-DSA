import java.util.Scanner;

// Parent Class
class Company {
    static String companyName = "TechCorp";
    String department;

    public Company(String department) {
        this.department = department;
    }
}

// Child Class
class Employee extends Company {
    int empId;
    String empName;
    double basicSalary;

    public Employee(String department, int id, String name, double salary) {
        super(department);
        this.empId = id;
        this.empName = name;
        this.basicSalary = salary;
    }

    public void calculateGrossSalary() {
        double hra = 0.2 * basicSalary;
        double da = 0.1 * basicSalary;
        double tax = 0.15 * basicSalary;

        double gross = basicSalary + hra + da - tax;

        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Gross Salary: " + gross);
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(dept, id, name, salary);
        emp.calculateGrossSalary();

        sc.close();
    }
}
