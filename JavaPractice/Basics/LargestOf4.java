// LeetCode Problem: Similar to finding maximum in array problems
// Related: LeetCode 215 - Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/

public class LargestOf4 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15, d = 30;
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Largest: " + max);
    }
}