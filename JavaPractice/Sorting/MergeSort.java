// LeetCode Problem: Similar to merge sort applications
// Related: LeetCode 88 - Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/
//
// BRUTE FORCE APPROACH:
// 1. Use built-in sorting: Arrays.sort(arr)
// 2. Time: O(n log n), Space: O(1)
// 3. Simple but doesn't demonstrate algorithm understanding
//
// OPTIMIZED APPROACH (Divide and Conquer):
// 1. Divide array into two halves recursively
// 2. Base case: single element is already sorted
// 3. Merge two sorted halves using two pointers
// 4. Compare elements and place smaller one first
// 5. Copy remaining elements from both arrays
// 6. Time: O(n log n), Space: O(n)
//
// EDGE CASES:
// - Empty array, single element
// - Already sorted array
// - Reverse sorted array
// - Array with duplicates

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}