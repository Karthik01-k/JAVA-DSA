// LeetCode Problem: Exact match
// LeetCode 9 - Palindrome Number
// https://leetcode.com/problems/palindrome-number/
//
// BRUTE FORCE APPROACH:
// 1. Convert number to string: String s = String.valueOf(num)
// 2. Use two pointers or reverse string and compare
// 3. Time: O(log n), Space: O(log n)
/*
String s = String.valueOf(num);
int left = 0, right = s.length() - 1;
while (left < right) {
    if (s.charAt(left) != s.charAt(right)) return false;
    left++; right--;
}
return true;
*/
//
// OPTIMIZED APPROACH (Mathematical):
// 1. Store original number for comparison
// 2. Reverse the number using same logic as reverse integer
// 3. Compare original with reversed number
// 4. If equal → palindrome, else → not palindrome
// 5. Time: O(log n), Space: O(1)
/*
int original = num, reversed = 0;
while (num > 0) {
    reversed = reversed * 10 + num % 10;
    num /= 10;
}
return original == reversed;
*/
//
// EDGE CASES:
// - Negative numbers (not palindrome by definition)
// - Single digit numbers (always palindrome)
// - Numbers ending with 0 (except 0 itself)
// - Integer overflow during reversal

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original == reversed ? "Palindrome" : "Not palindrome");
    }
}