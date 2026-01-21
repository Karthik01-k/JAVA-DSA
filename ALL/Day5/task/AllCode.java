// 1️⃣ Even or Odd
// claAllCodedd {
//     public static void main(String[] args) {
//         int n = 10;
//         if (n % 2 == 0)
//             System.out.println("Even");
//         else
//             System.out.println("Odd");
//     }
// }

// 2️⃣ Largest of 3 Numbers
// class LargestOfThree {
//     public static void main(String[] args) {
//         int a = 10, b = 20, c = 15;
//         if (a > b && a > c)
//             System.out.println(a);
//         else if (b > c)
//             System.out.println(b);
//         else
//             System.out.println(c);
//     }
// }

// 3️⃣ Leap Year
// class LeapYear {
//     public static void main(String[] args) {
//         int year = 2024;
//         if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
//             System.out.println("Leap Year");
//         else
//             System.out.println("Not a Leap Year");
//     }
// }

// 4️⃣ Grade System
// class GradeSystem {
//     public static void main(String[] args) {
//         int marks = 85;
//         if (marks >= 90)
//             System.out.println("Grade A");
//         else if (marks >= 75)
//             System.out.println("Grade B");
//         else if (marks >= 60)
//             System.out.println("Grade C");
//         else
//             System.out.println("Fail");
//     }
// }

// 5️⃣ Electricity Bill Calculation
// class ElectricityBill {
//     public static void main(String[] args) {
//         int units = 250;
//         double bill;

//         if (units <= 100)
//             bill = units * 1.5;
//         else if (units <= 200)
//             bill = 100 * 1.5 + (units - 100) * 2.5;
//         else
//             bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4;

//         System.out.println("Bill Amount: " + bill);
//     }
// }

// 6️⃣ Calculator using Switch Case
// class Calculator {
//     public static void main(String[] args) {
//         int a = 10, b = 5;
//         char op = '*';

//         switch (op) {
//             case '+': System.out.println(a + b); break;
//             case '-': System.out.println(a - b); break;
//             case '*': System.out.println(a * b); break;
//             case '/': System.out.println(a / b); break;
//             default: System.out.println("Invalid Operator");
//         }
//     }
// }

// ⭐ Swap Two Numbers (With Temp)
// class SwapWithTemp {
//     public static void main(String[] args) {
//         int a = 5, b = 10, temp;
//         temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a + " " + b);
//     }
// }

// ⭐ Swap Two Numbers (Without Temp)
// class SwapWithoutTemp {
//     public static void main(String[] args) {
//         int a = 5, b = 10;
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println(a + " " + b);
//     }
// }

// ⭐ Character Check
// class CharacterCheck {
//     public static void main(String[] args) {
//         char ch = '9';

//         if (Character.isAlphabetic(ch))
//             System.out.println("Alphabet");
//         else if (Character.isDigit(ch))
//             System.out.println("Digit");
//         else
//             System.out.println("Special Character");
//     }
// }

// ✅ DAY 2 – LOOPS (Separate Programs)
// 1️⃣ Prime Number Check
// class PrimeCheck {
//     public static void main(String[] args) {
//         int n = 29;
//         boolean prime = true;

//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 prime = false;
//                 break;
//             }
//         }
//         System.out.println(prime ? "Prime" : "Not Prime");
//     }
// }

// 2️⃣ Factorial
// class Factorial {
//     public static void main(String[] args) {
//         int n = 5, fact = 1;
//         for (int i = 1; i <= n; i++)
//             fact *= i;

//         System.out.println(fact);
//     }
// }

// 3️⃣ Fibonacci Series
// class Fibonacci {
//     public static void main(String[] args) {
//         int a = 0, b = 1;

//         for (int i = 1; i <= 5; i++) {
//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }

// 4️⃣ Reverse Number
// class ReverseNumber {
//     public static void main(String[] args) {
//         int n = 1234, rev = 0;

//         while (n > 0) {
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(rev);
//     }
// }

// 5️⃣ Palindrome Number
// class Palindrome {
//     public static void main(String[] args) {
//         int n = 121, rev = 0, temp = n;

//         while (n > 0) {
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }

//         System.out.println(rev == temp ? "Palindrome" : "Not Palindrome");
//     }
// }

// ⭐ Sum & Count Digits
// class SumCountDigits {
//     public static void main(String[] args) {
//         int n = 1234, sum = 0, count = 0;

//         while (n > 0) {
//             sum += n % 10;
//             count++;
//             n /= 10;
//         }
//         System.out.println("Sum=" + sum + " Count=" + count);
//     }
// }

// ⭐ Print Prime Numbers 1 to N
// class PrimesTillN {
//     public static void main(String[] args) {
//         int n = 50;

//         for (int i = 2; i <= n; i++) {
//             boolean prime = true;
//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     prime = false;
//                     break;
//                 }
//             }
//             if (prime)
//                 System.out.print(i + " ");
//         }
//     }
// }

// ⭐ FizzBuzz
// class FizzBuzz {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 3 == 0 && i % 5 == 0)
//                 System.out.println("FizzBuzz");
//             else if (i % 3 == 0)
//                 System.out.println("Fizz");
//             else if (i % 5 == 0)
//                 System.out.println("Buzz");
//             else
//                 System.out.println(i);
//         }
//     } 
// }