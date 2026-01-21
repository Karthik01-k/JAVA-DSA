// ============ TASK 2: OOP CONCEPTS - JAVA EXAMPLES ============

// ============ 1. CLASS & OBJECT ============
// HOW TO APPROACH:
// Step 1: Define a class as a blueprint with properties (attributes)
// Step 2: Add constructor to initialize objects with values
// Step 3: Create methods to define behavior
// Step 4: Create objects (instances) using the class blueprint
// Step 5: Access properties and call methods on objects
//
// Concept: Blueprint (Class) creates instances (Objects)
class Car {
    String color;
    String model;

    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void display() {
        System.out.println("Car: " + model + ", Color: " + color);
    }
}

// ============ 2. INHERITANCE ============
// HOW TO APPROACH:
// Step 1: Identify common properties and methods in multiple classes
// Step 2: Create parent class with common functionality
// Step 3: Create child classes that extend the parent class
// Step 4: Use super() in constructor if needed
// Step 5: Child classes automatically have parent methods and properties
//
// Concept: Child class inherits properties and methods from parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// ============ 3. POLYMORPHISM ============
// HOW TO APPROACH:
// Step 1: Create parent class with method to override
// Step 2: Create multiple child classes extending parent
// Step 3: Override parent method in each child with different implementation
// Step 4: Use @Override annotation to mark overridden methods
// Step 5: Create parent references and assign child objects
// Step 6: Call method - it will use child's implementation (dynamic dispatch)
//
// Concept: Same method name, different implementations (Method Overriding)
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// ============ 4. ENCAPSULATION ============
// HOW TO APPROACH:
// Step 1: Make all attributes private (hide from outside)
// Step 2: Create getter methods to read values (controlled access)
// Step 3: Create setter methods to modify values (with validation)
// Step 4: Add business logic in setters (e.g., check if value is valid)
// Step 5: Objects interact through public methods, not direct attribute access
//
// Concept: Hide internal details, provide controlled access via getters/setters
class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double newGPA) {
        if (newGPA >= 0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

// ============ 5. ABSTRACTION ============
// HOW TO APPROACH:
// Step 1: Identify what operations are needed (abstract methods)
// Step 2: Create abstract class with abstract methods (no implementation)
// Step 3: Create concrete classes that implement abstract methods
// Step 4: Each implementation handles differently
// Step 5: Use abstract class reference to call methods polymorphically
//
// Concept: Hide implementation details, show only functionality
abstract class PaymentMethod {
    abstract void processPayment(double amount);

    void confirmPayment() {
        System.out.println("Payment confirmed!");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card");
    }
}

class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal");
    }
}

// ============ MAIN - TEST ALL OOP CONCEPTS ============
public class Task2_OOPConcepts {
    public static void main(String[] args) {
        System.out.println("=== OOP CONCEPTS IN JAVA ===\n");

        // 1. CLASS & OBJECT
        System.out.println("1. CLASS & OBJECT");
        Car car1 = new Car("Red", "Ferrari");
        Car car2 = new Car("Blue", "BMW");
        car1.display();
        car2.display();
        System.out.println();

        // 2. INHERITANCE
        System.out.println("2. INHERITANCE");
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.bark();  // Own method
        System.out.println();

        // 3. POLYMORPHISM
        System.out.println("3. POLYMORPHISM");
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
        System.out.println();

        // 4. ENCAPSULATION
        System.out.println("4. ENCAPSULATION");
        Student student = new Student(101, "John", 3.8);
        student.display();
        student.setGPA(3.9);
        student.display();
        System.out.println();

        // 5. ABSTRACTION
        System.out.println("5. ABSTRACTION");
        PaymentMethod payment1 = new CreditCard();
        PaymentMethod payment2 = new PayPal();
        payment1.processPayment(100);
        payment1.confirmPayment();
        payment2.processPayment(50);
        payment2.confirmPayment();
    }
}
