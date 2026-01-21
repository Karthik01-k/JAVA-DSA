// LeetCode Problem: Similar to sign checking in various problems
// Related: LeetCode 1822 - Sign of the Product of an Array
// https://leetcode.com/problems/sign-of-the-product-of-an-array/
//
// APPROACH:
// 1. Compare number with 0 using comparison operators
// 2. Use if-else chain: > 0 (positive), < 0 (negative), == 0 (zero)
// 3. Time: O(1), Space: O(1)

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num = -5;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}