// LeetCode Problem: Exact match
// LeetCode 7 - Reverse Integer
// https://leetcode.com/problems/reverse-integer/
//
// BRUTE FORCE APPROACH:
// 1. Convert to string, reverse string, convert back to int
// 2. Handle negative sign separately
// 3. Time: O(log n), Space: O(log n)
//
// OPTIMIZED APPROACH (Mathematical):
// 1. Extract last digit using num % 10
// 2. Build reversed number: reversed = reversed * 10 + digit
// 3. Remove last digit: num /= 10
// 4. Continue until num becomes 0
// 5. Handle overflow in real implementation
// 6. Time: O(log n), Space: O(1)
//
// EDGE CASES:
// - Negative numbers
// - Numbers with trailing zeros
// - Integer overflow (return 0 in LeetCode)
// - Single digit numbers

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}