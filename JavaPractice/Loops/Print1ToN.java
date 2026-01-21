// LeetCode Problem: Similar to iterative problems
// Related: LeetCode 1342 - Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//
// APPROACH:
// 1. Use for loop with initialization, condition, increment
// 2. Start from 1, continue while i <= n, increment by 1
// 3. Print each number in the loop
// 4. Time: O(n), Space: O(1)

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}