// LeetCode Problem: Similar to character classification problems
// Related: LeetCode 345 - Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/
//
// APPROACH:
// 1. Create string of all vowels: "aeiouAEIOU"
// 2. Use indexOf() method to check if character exists in vowel string
// 3. If indexOf() returns -1 → not found (consonant), else → vowel
// 4. Time: O(1), Space: O(1)
//
// EDGE CASES:
// - Non-alphabetic characters (numbers, symbols)
// - Uppercase vs lowercase vowels
// - Special characters like accented vowels
// - Empty character input

public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'a';
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }
    }
}