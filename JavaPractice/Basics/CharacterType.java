// LeetCode Problem: Similar to character validation problems
// Related: LeetCode 125 - Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/
//
// APPROACH:
// 1. Use Character class methods for type checking
// 2. Character.isDigit() - checks if character is 0-9
// 3. Character.isLetter() - checks if character is a-z or A-Z
// 4. Else - special character
// 5. Time: O(1), Space: O(1)

public class CharacterType {
    public static void main(String[] args) {
        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else if (Character.isLetter(ch)) {
            System.out.println("Letter");
        } else {
            System.out.println("Special character");
        }
    }
}