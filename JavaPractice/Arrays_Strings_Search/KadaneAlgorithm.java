// LeetCode Problem: Exact match
// LeetCode 53 - Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
//
// PATTERN RECOGNITION:
// - Finding maximum sum of contiguous subarray
// - Need to track running sum and decide when to restart
// - Pattern: "Dynamic Programming" - optimal substructure property
// - Key insight: if current sum becomes negative, start fresh
// - Similar problems: Maximum Product Subarray, Best Time to Buy/Sell Stock
//
// BRUTE FORCE APPROACH:
// 1. Use nested loops: for i=0 to n-1, for j=i to n-1
// 2. Calculate sum of subarray from i to j
// 3. Keep track of maximum sum found
// 4. Time: O(n³) with sum calculation, O(n²) if sum maintained
// 5. Space: O(1)
/*
int maxSum = Integer.MIN_VALUE;
for (int i = 0; i < nums.length; i++) {
    int currentSum = 0;
    for (int j = i; j < nums.length; j++) {
        currentSum += nums[j];
        maxSum = Math.max(maxSum, currentSum);
    }
}
*/
//
// OPTIMIZED APPROACH (Kadane's Algorithm):
// 1. Initialize maxSum and currentSum with first element
// 2. For each element, decide: extend current subarray or start new
// 3. currentSum = max(current_element, currentSum + current_element)
// 4. Update maxSum = max(maxSum, currentSum)
// 5. Continue for all elements
// 6. Time: O(n), Space: O(1)
/*
int maxSum = nums[0], currentSum = nums[0];
for (int i = 1; i < nums.length; i++) {
    currentSum = Math.max(nums[i], currentSum + nums[i]);
    maxSum = Math.max(maxSum, currentSum);
}
*/
//
// EDGE CASES:
// - All negative numbers
// - Single element array
// - All positive numbers
// - Array with zeros

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}