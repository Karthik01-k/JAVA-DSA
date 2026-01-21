// LeetCode Problem: Exact match
// LeetCode 75 - Sort Colors
// https://leetcode.com/problems/sort-colors/
//
// PATTERN RECOGNITION:
// - Need to sort array with only 3 distinct values (0, 1, 2)
// - Want to do it in single pass with constant space
// - Pattern: "Three Pointers" - partition array into three sections
// - Key insight: maintain boundaries for each color region
// - Similar problems: Partition Array, Move Zeroes, Sort Array by Parity
//
// BRUTE FORCE APPROACH:
// 1. Count frequency of 0s, 1s, 2s using single loop
// 2. Overwrite array: first count0 elements as 0, next count1 as 1, rest as 2
// 3. Time: O(n), Space: O(1) - but requires two passes
/*
int count0 = 0, count1 = 0, count2 = 0;
for (int num : nums) {
    if (num == 0) count0++;
    else if (num == 1) count1++;
    else count2++;
}
int i = 0;
while (count0-- > 0) nums[i++] = 0;
while (count1-- > 0) nums[i++] = 1;
while (count2-- > 0) nums[i++] = 2;
*/
//
// OPTIMIZED APPROACH (Dutch National Flag Algorithm):
// 1. Use three pointers: low, mid, high
// 2. low: boundary for 0s, high: boundary for 2s, mid: current element
// 3. If nums[mid] == 0: swap with low, increment both low and mid
// 4. If nums[mid] == 1: just increment mid
// 5. If nums[mid] == 2: swap with high, decrement high (don't increment mid)
// 6. Time: O(n), Space: O(1) - single pass
/*
int low = 0, mid = 0, high = nums.length - 1;
while (mid <= high) {
    if (nums[mid] == 0) {
        swap(nums, low++, mid++);
    } else if (nums[mid] == 1) {
        mid++;
    } else {
        swap(nums, mid, high--);
    }
}
*/
//
// EDGE CASES:
// - Array with only one color
// - Already sorted array
// - Array with only two colors
// - Empty array, single element

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}