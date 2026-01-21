// LeetCode Problem: Exact match
// LeetCode 412 - Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
//
// APPROACH:
// 1. Loop from 1 to n
// 2. Check divisibility in order: 15 (both), 3 (Fizz), 5 (Buzz)
// 3. Use modulo operator: i % 15 == 0, i % 3 == 0, i % 5 == 0
// 4. Add appropriate string to result list
// 5. Return list of strings
// 6. Time: O(n), Space: O(n)

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
    }
}