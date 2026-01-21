// LeetCode Problem: Similar to FizzBuzz problem
// Related: LeetCode 412 - Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
//
// APPROACH:
// 1. Check divisibility using modulo operator (%)
// 2. Use logical AND (&&) to check both conditions
// 3. num % 3 == 0 AND num % 5 == 0
// 4. Alternative: check num % 15 == 0 (LCM of 3 and 5)
// 5. Time: O(1), Space: O(1)

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        int num = 15;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both");
        }
    }
}