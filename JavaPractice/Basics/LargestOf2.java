// LeetCode Problem: Similar to finding maximum in comparisons
// Related: LeetCode 104 - Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
//
// APPROACH:
// 1. Use ternary operator (condition ? value1 : value2)
// 2. Compare a > b, return larger value
// 3. Alternative: Math.max(a, b)
// 4. Time: O(1), Space: O(1)

public class LargestOf2 {
    public static void main(String[] args) {
        int a = 15, b = 25;
        int max = (a > b) ? a : b;
        System.out.println("Largest: " + max);
    }
}