// LeetCode Problem: Similar to date/time calculations
// Related: LeetCode 1185 - Day of the Week
// https://leetcode.com/problems/day-of-the-week/
//
// APPROACH:
// 1. Leap year rules: divisible by 4 AND (not by 100 OR by 400)
// 2. Use logical operators: && (AND), || (OR), ! (NOT)
// 3. Check conditions in order: year % 4 == 0, year % 100 != 0, year % 400 == 0
// 4. Time: O(1), Space: O(1)
//
// EDGE CASES:
// - Century years (1900 - not leap, 2000 - leap)
// - Negative years (historical dates)
// - Year 0 (doesn't exist in Gregorian calendar)
// - Very large years

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (isLeap ? "leap" : "not leap") + " year");
    }
}