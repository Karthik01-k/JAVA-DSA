import java.util.Scanner;
public class Task3_ConditionalStatements {
    static Scanner sc = new Scanner(System.in);

    // ============ 1. CHECK EVEN OR ODD ============
    // HOW TO APPROACH:
    // Step 1: Take a number as input
    // Step 2: Use modulo operator (%) to divide by 2
    // Step 3: If remainder is 0 → Even
    // Step 4: If remainder is 1 → Odd
    public static void checkEvenOdd() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN");
        } else {
            System.out.println(num + " is ODD");
        }
    }

    // ============ 2. CHECK POSITIVE / NEGATIVE / ZERO ============
    // HOW TO APPROACH:
    // Step 1: Take a number as input
    // Step 2: Compare with 0 using if-else if-else
    // Step 3: If > 0 → Positive
    // Step 4: If < 0 → Negative
    // Step 5: If = 0 → Zero
    public static void checkSign() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is POSITIVE");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }
    }

    // ============ 3. FIND LARGEST OF 2 NUMBERS ============
    // HOW TO APPROACH:
    // Step 1: Take two numbers as input (a, b)
    // Step 2: Compare using conditional operator or if-else
    // Step 3: If a > b → return a
    // Step 4: Else → return b
    // Step 5: Can use ternary operator: (a > b) ? a : b
    public static void largestOf2() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int largest = (a > b) ? a : b;
        System.out.println("Largest: " + largest);
    }

    // ============ 4. FIND LARGEST OF 3 NUMBERS ============
    // HOW TO APPROACH:
    // Step 1: Take three numbers (a, b, c)
    // Step 2: Start with largest = a
    // Step 3: Compare b with largest, update if b is larger
    // Step 4: Compare c with largest, update if c is larger
    // Step 5: largest now contains the maximum value
    public static void largestOf3() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest: " + largest);
    }

    // ============ 5. LEAP YEAR CHECK ============
    // HOW TO APPROACH:
    // Step 1: Leap year if divisible by 4 AND not by 100 → Leap
    // Step 2: OR if divisible by 400 → Leap
    // Step 3: All other years → Not leap
    // Formula: (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    public static void leapYearCheck() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a LEAP YEAR");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
    }

    // ============ 6. VOWEL OR CONSONANT ============
    // HOW TO APPROACH:
    // Step 1: Take a character as input
    // Step 2: Convert to lowercase for easier comparison
    // Step 3: Check if character is 'a', 'e', 'i', 'o', 'u'
    // Step 4: If yes → Vowel
    // Step 5: Otherwise → Consonant
    public static void vowelOrConsonant() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a VOWEL");
        } else {
            System.out.println(ch + " is a CONSONANT");
        }
    }

    // ============ 7. GRADE CALCULATION ============
    // HOW TO APPROACH:
    // Step 1: Take marks (0-100) as input
    // Step 2: Use if-else if chain to check ranges:
    //         >= 90 → A
    //         >= 80 → B
    //         >= 70 → C
    //         >= 60 → D
    //         < 60 → F
    // Step 3: Display the corresponding grade
    public static void gradeCalculation() {
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }

    // ============ 8. DIVISIBLE BY 5 AND 11 ============
    // HOW TO APPROACH:
    // Step 1: Take a number as input
    // Step 2: Check multiple conditions:
    //         If (num % 5 == 0 && num % 11 == 0) → Divisible by both
    //         Else if (num % 5 == 0) → Divisible by 5 only
    //         Else if (num % 11 == 0) → Divisible by 11 only
    //         Else → Not divisible by either
    public static void divisibleBy5And11() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5 only");
        } else if (num % 11 == 0) {
            System.out.println(num + " is divisible by 11 only");
        } else {
            System.out.println(num + " is not divisible by 5 or 11");
        }
    }

    // ============ 9. CHECK PRIME NUMBER ============
    // HOW TO APPROACH:
    // Step 1: Prime numbers > 1 with no divisors except 1 and itself
    // Step 2: If number < 2 → Not prime
    // Step 3: Check if any number from 2 to √n divides n
    // Step 4: If divisor found → Not prime
    // Step 5: If no divisor found → Prime
    public static void checkPrime() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " is NOT a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a PRIME number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
    }

    // ============ 10. FACTORIAL OF A NUMBER ============
    // HOW TO APPROACH:
    // Step 1: Factorial of n = n × (n-1) × (n-2) × ... × 1
    // Step 2: Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
    // Step 3: Factorial of 0 and 1 is 1
    // Step 4: Use loop from 1 to n, multiply all values
    // Step 5: Handle negative numbers (not defined)
    public static void factorial() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }

    // ============ 11. FIBONACCI SERIES ============
    // HOW TO APPROACH:
    // Step 1: Fibonacci = series where each number is sum of previous two
    // Step 2: Starts with 0, 1 (or 1, 1)
    // Step 3: Series: 0, 1, 1, 2, 3, 5, 8, 13, 21...
    // Step 4: Start with a=0, b=1
    // Step 5: Loop n times: print a, then calculate next = a + b
    public static void fibonacciSeries() {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        System.out.print("Fibonacci Series: ");
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // ============ 12. REVERSE A NUMBER ============
    // HOW TO APPROACH:
    // Step 1: Extract last digit using modulo: num % 10
    // Step 2: Add digit to reversed number: reversed = reversed * 10 + digit
    // Step 3: Remove last digit from num: num = num / 10
    // Step 4: Repeat steps 1-3 until num becomes 0
    // Step 5: Result is the reversed number
    public static void reverseNumber() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse of " + original + " = " + reversed);
    }

    // ============ 13. PALINDROME NUMBER CHECK ============
    // HOW TO APPROACH:
    // Step 1: Palindrome number reads same forwards and backwards
    // Step 2: Examples: 121, 1221, 12321
    // Step 3: Reverse the number (same as problem 12)
    // Step 4: Compare original with reversed
    // Step 5: If equal → Palindrome, else → Not palindrome
    public static void palindromeCheck() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a PALINDROME");
        } else {
            System.out.println(original + " is NOT a palindrome");
        }
    }

    // ============ 14. ANAGRAM STRING CHECK ============
    // HOW TO APPROACH:
    // Step 1: Anagrams have same characters with same frequency
    // Step 2: Example: "listen" and "silent" are anagrams
    // Step 3: Convert both strings to lowercase
    // Step 4: Convert strings to character arrays
    // Step 5: Sort both arrays
    // Step 6: Compare sorted arrays - if equal → Anagram
    public static void anagramCheck() {
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are ANAGRAMS");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams");
        }
    }

    // ============ 15. SUM OF DIGITS ============
    // HOW TO APPROACH:
    // Step 1: Extract last digit using modulo: digit = num % 10
    // Step 2: Add digit to sum: sum += digit
    // Step 3: Remove last digit: num = num / 10
    // Step 4: Repeat steps 1-3 until num becomes 0
    // Step 5: Result is sum of all digits
    // Note: Use Math.abs() to handle negative numbers
    public static void sumOfDigits() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int original = num;
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits of " + original + " = " + sum);
    }

    // ============ MENU SYSTEM ============
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║   15 CONDITIONAL STATEMENTS PRACTICE PROBLEMS      ║");
        System.out.println("╚════════════════════════════════════════════════════╝\n");

        while (true) {
            System.out.println("\n--- SELECT A PROBLEM ---");
            System.out.println("1.  Check Even or Odd");
            System.out.println("2.  Check Positive / Negative / Zero");
            System.out.println("3.  Find Largest of 2 Numbers");
            System.out.println("4.  Find Largest of 3 Numbers");
            System.out.println("5.  Leap Year Check");
            System.out.println("6.  Vowel or Consonant");
            System.out.println("7.  Grade Calculation");
            System.out.println("8.  Divisible by 5 and 11");
            System.out.println("9.  Check Prime Number");
            System.out.println("10. Factorial of a Number");
            System.out.println("11. Fibonacci Series");
            System.out.println("12. Reverse a Number");
            System.out.println("13. Palindrome Number Check");
            System.out.println("14. Anagram String Check");
            System.out.println("15. Sum of Digits");
            System.out.println("0.  Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- PROBLEM 1: EVEN OR ODD ---");
                    checkEvenOdd();
                    break;
                case 2:
                    System.out.println("\n--- PROBLEM 2: POSITIVE / NEGATIVE / ZERO ---");
                    checkSign();
                    break;
                case 3:
                    System.out.println("\n--- PROBLEM 3: LARGEST OF 2 ---");
                    largestOf2();
                    break;
                case 4:
                    System.out.println("\n--- PROBLEM 4: LARGEST OF 3 ---");
                    largestOf3();
                    break;
                case 5:
                    System.out.println("\n--- PROBLEM 5: LEAP YEAR ---");
                    leapYearCheck();
                    break;
                case 6:
                    System.out.println("\n--- PROBLEM 6: VOWEL OR CONSONANT ---");
                    vowelOrConsonant();
                    break;
                case 7:
                    System.out.println("\n--- PROBLEM 7: GRADE CALCULATION ---");
                    gradeCalculation();
                    break;
                case 8:
                    System.out.println("\n--- PROBLEM 8: DIVISIBLE BY 5 AND 11 ---");
                    divisibleBy5And11();
                    break;
                case 9:
                    System.out.println("\n--- PROBLEM 9: PRIME NUMBER ---");
                    checkPrime();
                    break;
                case 10:
                    System.out.println("\n--- PROBLEM 10: FACTORIAL ---");
                    factorial();
                    break;
                case 11:
                    System.out.println("\n--- PROBLEM 11: FIBONACCI SERIES ---");
                    fibonacciSeries();
                    break;
                case 12:
                    System.out.println("\n--- PROBLEM 12: REVERSE NUMBER ---");
                    reverseNumber();
                    break;
                case 13:
                    System.out.println("\n--- PROBLEM 13: PALINDROME CHECK ---");
                    palindromeCheck();
                    break;
                case 14:
                    System.out.println("\n--- PROBLEM 14: ANAGRAM CHECK ---");
                    anagramCheck();
                    break;
                case 15:
                    System.out.println("\n--- PROBLEM 15: SUM OF DIGITS ---");
                    sumOfDigits();
                    break;
                case 0:
                    System.out.println("\nThank you for practicing! Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
