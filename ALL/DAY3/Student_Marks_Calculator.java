// Program 1: Student Marks Calculator

// Problem Statement:

// Create a Java program for a Student class that contains:

// One class variable representing the passing percentage

// Object variables for student name and marks in three subjects

// A constructor to initialize student name and marks

// A method that calculates the total marks, percentage, and checks whether the student passed or failed using conditional statements

import java.util.Scanner;

class Student {
	static double passingPercentage = 40.0;

	String name;
	int marks1;
	int marks2;
	int marks3;

	Student(String name, int marks1, int marks2, int marks3) {
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	void calculateAndPrint() {
		int total = marks1 + marks2 + marks3;
		double percentage = total / 3.0;

		System.out.println("Name: " + name);
		System.out.println("Total Marks: " + total);
		System.out.printf("Percentage: %.2f%%\n", percentage);

		if (percentage >= passingPercentage) {
			System.out.println("Result: PASS");
		} else {
			System.out.println("Result: FAIL");
		}
	}
}

public class Student_Marks_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = sc.nextLine();

		System.out.print("Enter marks for subject 1: ");
		int s1 = sc.nextInt();
		System.out.print("Enter marks for subject 2: ");
		int s2 = sc.nextInt();
		System.out.print("Enter marks for subject 3: ");
		int s3 = sc.nextInt();

		Student student = new Student(name, s1, s2, s3);
		System.out.println();
		student.calculateAndPrint();

		sc.close();
	}
}
