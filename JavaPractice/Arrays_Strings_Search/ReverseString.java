// LeetCode Problem: Exact match
// LeetCode 344 - Reverse String
// https://leetcode.com/problems/reverse-string/
//
// PATTERN RECOGNITION:
// - Need to reverse order of elements
// - In-place modification required
// - Pattern: "Two Pointers" - start from both ends, move towards center
// - Key insight: swap elements at symmetric positions
// - Similar problems: Reverse Array, Palindrome Check, Valid Palindrome
//
// BRUTE FORCE APPROACH:
// 1. Create new array of same size
// 2. Use single loop: for i=0 to n-1
// 3. Copy s[i] to newArray[n-1-i]
// 4. Copy back to original array
// 5. Time: O(n), Space: O(n)
/*
char[] temp = new char[s.length];
for (int i = 0; i < s.length; i++) {
    temp[i] = s[s.length - 1 - i];
}
for (int i = 0; i < s.length; i++) {
    s[i] = temp[i];
}
*/
//
// OPTIMIZED APPROACH (Two Pointers):
// 1. Use two pointers: left = 0, right = length - 1
// 2. Swap characters at left and right positions
// 3. Move pointers towards center: left++, right--
// 4. Continue until left >= right
// 5. In-place reversal with O(1) extra space
// 6. Time: O(n), Space: O(1)
/*
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;
    left++; right--;
}
*/
//
// EDGE CASES:
// - Empty array, single character
// - All same characters
// - Even vs odd length arrays

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int left = 0, right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        
        System.out.println("Reversed: " + new String(s));
    }
}