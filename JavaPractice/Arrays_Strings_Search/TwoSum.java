// LeetCode Problem: Exact match
// LeetCode 1 - Two Sum
// https://leetcode.com/problems/two-sum/
//
// PATTERN RECOGNITION:
// - Need to find TWO elements that sum to target
// - Array search problem with complement relationship
// - Key insight: target - current = complement
// - Pattern: "Find pair with given sum" → Use HashMap for O(1) lookup
// - Similar problems: 3Sum, 4Sum, Two Sum II
//
// BRUTE FORCE APPROACH:
// 1. Use nested loops: for i=0 to n-1, for j=i+1 to n-1
// 2. Check if nums[i] + nums[j] == target
// 3. Return [i, j] if found
// 4. Time: O(n²), Space: O(1)
/*
for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
            return new int[]{i, j};
        }
    }
}
*/
//
// OPTIMIZED APPROACH (HashMap):
// 1. Use HashMap to store number and its index
// 2. For each number, calculate complement = target - current
// 3. Check if complement exists in map
// 4. If found → return indices, else → add current to map
// 5. One pass solution with O(n) time
// 6. Time: O(n), Space: O(n)
/*
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
    }
    map.put(nums[i], i);
}
*/
//
// EDGE CASES:
// - Empty array, array with < 2 elements
// - No solution exists
// - Duplicate numbers
// - Negative numbers, zero

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}