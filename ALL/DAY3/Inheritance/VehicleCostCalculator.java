/*
 Program 4: Vehicle Cost Calculation (Inheritance)
 Problem Statement:
 Create a Java program with a Vehicle parent class and a Car child class.

 Vehicle class:
     // Contains object variables for brand and base price
     // Uses a constructor to initialize vehicle details

 Car class:
     // Inherits from Vehicle
     // Contains a class variable representing GST percentage
     // Contains object variables for model and insurance cost
     // Uses a constructor to initialize all values
     // Includes a method to calculate total on-road price using arithmetic statements
*/

import java.util.Scanner;

// Parent Class
class Vehicle {
    String brand;
    double basePrice;

    public Vehicle(String brand, double basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }
}

// Child Class
class Car extends Vehicle {
    static double GST_PERCENT = 18.0;
    String model;
    double insuranceCost;

    public Car(String brand, double basePrice, String model, double insurance) {
        super(brand, basePrice);
        this.model = model;
        this.insuranceCost = insurance;
    }

    public void calculateOnRoadPrice() {
        double gstAmount = (GST_PERCENT / 100) * basePrice;
        double totalPrice = basePrice + gstAmount + insuranceCost;

        System.out.println("\nBrand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("On-Road Price: " + totalPrice);
    }
}

public class VehicleCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter base price: ");
        double basePrice = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter insurance cost: ");
        double insurance = sc.nextDouble();

        Car car = new Car(brand, basePrice, model, insurance);
        car.calculateOnRoadPrice();

        sc.close();
    }
}
