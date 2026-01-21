// OOP Concepts: Class, Object, Encapsulation
// Similar to LeetCode problems involving class design
// Related: LeetCode 355 - Design Twitter
// https://leetcode.com/problems/design-twitter/
//
// APPROACH (Object-Oriented Design):
// 1. Define class with private fields (encapsulation)
// 2. Create constructor to initialize object state
// 3. Provide public getter methods for accessing private data
// 4. Provide public setter methods for modifying private data
// 5. Follow naming conventions: camelCase for methods/variables
// 6. Demonstrate object creation and method calls

public class Student {
    private String name;
    private int age;
    private double grade;
    
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }
    
    public void setGrade(double grade) { this.grade = grade; }
    
    public static void main(String[] args) {
        Student s = new Student("John", 20, 85.5);
        System.out.println("Name: " + s.getName() + ", Grade: " + s.getGrade());
    }
}