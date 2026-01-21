// LeetCode Problem: Similar to sorting applications
// Related: LeetCode 215 - Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
//
// BRUTE FORCE APPROACH:
// 1. Use nested loops for bubble sort or selection sort
// 2. Bubble sort: for i=0 to n-1, for j=0 to n-i-2, swap if arr[j] > arr[j+1]
// 3. Time: O(n²), Space: O(1)
//
// OPTIMIZED APPROACH (Divide and Conquer):
// 1. Choose pivot element (usually last element)
// 2. Partition: place smaller elements left, larger right
// 3. Recursively sort left and right subarrays
// 4. Partition logic: maintain index for smaller elements
// 5. Swap elements to maintain partition property
// 6. Time: O(n log n) average, O(n²) worst, Space: O(log n)
//
// EDGE CASES:
// - Empty array, single element
// - Already sorted array (worst case for basic quicksort)
// - All elements same
// - Reverse sorted array

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}