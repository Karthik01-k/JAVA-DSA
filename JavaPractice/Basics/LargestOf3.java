// LeetCode Problem: Similar to finding maximum among multiple elements
// Related: LeetCode 414 - Third Maximum Number
// https://leetcode.com/problems/third-maximum-number/
//
// APPROACH:
// 1. Use nested Math.max() calls
// 2. First find max of first two, then compare with third
// 3. Alternative: Use if-else comparisons
// 4. Time: O(1), Space: O(1)

public class LargestOf3 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Largest: " + max);
    }
}