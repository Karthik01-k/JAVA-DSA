// LeetCode Problem: Similar to string case manipulation
// Related: LeetCode 709 - To Lower Case
// https://leetcode.com/problems/to-lower-case/
//
// APPROACH:
// 1. Check current case using Character.isUpperCase()
// 2. Convert using Character.toLowerCase() or Character.toUpperCase()
// 3. Alternative: Use ASCII values (A-Z: 65-90, a-z: 97-122)
// 4. Time: O(1), Space: O(1)

public class CaseConversion {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isUpperCase(ch)) {
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        } else {
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        }
    }
}