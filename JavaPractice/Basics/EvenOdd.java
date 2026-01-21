// LeetCode Problem: Similar to checking even/odd conditions in various problems
// Related: LeetCode 1342 - Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//
// APPROACH:
// 1. Use modulo operator (%) to check remainder when divided by 2
// 2. If remainder is 0 → even, else → odd
// 3. Time: O(1), Space: O(1)
//
// EDGE CASES:
// - Zero (considered even)
// - Negative numbers (same logic applies)
// - Very large numbers (int overflow)

public class EvenOdd {
    public static void main(String[] args) {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}