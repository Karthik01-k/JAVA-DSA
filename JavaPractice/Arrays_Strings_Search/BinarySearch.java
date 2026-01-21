// LeetCode Problem: Exact match
// LeetCode 704 - Binary Search
// https://leetcode.com/problems/binary-search/
//
// PATTERN RECOGNITION:
// - Searching in SORTED array
// - Need to find specific target value
// - Pattern: "Divide and Conquer" - eliminate half of search space each time
// - Key insight: compare with middle element to decide which half to search
// - Similar problems: Search Insert Position, First Bad Version, Peak Element
//
// BRUTE FORCE APPROACH (Linear Search):
// 1. Use single loop: for i=0 to n-1
// 2. Check if nums[i] == target
// 3. Return i if found, -1 if not found
// 4. Time: O(n), Space: O(1)
/*
for (int i = 0; i < nums.length; i++) {
    if (nums[i] == target) {
        return i;
    }
}
return -1;
*/
//
// OPTIMIZED APPROACH (Binary Search):
// 1. Use two pointers: left = 0, right = length - 1
// 2. Calculate mid = left + (right - left) / 2 (avoid overflow)
// 3. If nums[mid] == target → found, return index
// 4. If nums[mid] < target → search right half: left = mid + 1
// 5. If nums[mid] > target → search left half: right = mid - 1
// 6. Time: O(log n), Space: O(1)
/*
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return -1;
*/
//
// EDGE CASES:
// - Empty array, single element
// - Target not in array
// - Target at first/last position
// - Array with duplicates

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}