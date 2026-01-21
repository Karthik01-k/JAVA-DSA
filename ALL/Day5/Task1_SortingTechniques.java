import java.util.Arrays;

public class Task1_SortingTechniques {

    // ============ 1. BUBBLE SORT ============
    // HOW TO APPROACH:
    // Step 1: Understand - Compare adjacent pairs and swap if left > right
    // Step 2: Logic - Repeat process n times, each pass moves largest element to end
    // Step 3: Implement - Use nested loops (outer: passes, inner: comparisons)
    // Step 4: Optimize - Stop early if no swaps occur (already sorted)
    //
    // Idea: Compare adjacent elements and swap if out of order
    // Comparison: O(n²) - Simple but inefficient
    // Best for: Learning purposes, small datasets, already sorted data
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ============ 2. SELECTION SORT ============
    // HOW TO APPROACH:
    // Step 1: Find minimum element in unsorted part
    // Step 2: Swap it with first unsorted position
    // Step 3: Move boundary of sorted portion one step right
    // Step 4: Repeat until all elements are sorted
    //
    // Idea: Find minimum element and place it at beginning
    // Comparison: O(n²) - Better than bubble sort in practice
    // Best for: Small datasets, when memory write is expensive
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // ============ 3. INSERTION SORT ============
    // HOW TO APPROACH:
    // Step 1: Start from second element (first is already sorted)
    // Step 2: Compare with sorted portion and find correct position
    // Step 3: Shift larger elements to right
    // Step 4: Insert current element in correct position
    // Step 5: Repeat until all elements are processed
    //
    // Idea: Insert element in correct position in sorted portion
    // Comparison: O(n²) - Efficient for small datasets, best for nearly sorted
    // Best for: Small datasets, online sorting, nearly sorted data
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // ============ 4. QUICK SORT ============
    // HOW TO APPROACH:
    // Step 1: Choose a pivot element
    // Step 2: Partition array: left side < pivot, right side > pivot
    // Step 3: Recursively sort left partition
    // Step 4: Recursively sort right partition
    // Step 5: Combine (already in correct positions after partitioning)
    //
    // Idea: Divide and conquer - partition and recursively sort
    // Comparison: O(n log n) average, O(n²) worst case - Fastest for large datasets
    // Best for: Large datasets, general-purpose sorting
    public static void quickSort(int[] arr) {
        if (arr.length == 0) return;
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // ============ 5. MERGE SORT ============
    // HOW TO APPROACH:
    // Step 1: Divide array into two halves
    // Step 2: Recursively sort left half
    // Step 3: Recursively sort right half
    // Step 4: Merge two sorted halves into one sorted array
    // Step 5: Compare elements from both halves and place smaller first
    //
    // Idea: Divide in half and merge sorted halves
    // Comparison: O(n log n) guaranteed - Stable sort, consistent performance
    // Best for: When guaranteed O(n log n) is needed, stable sort required
    public static void mergeSort(int[] arr) {
        if (arr.length == 0) return;
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    // ============ 6. RADIX SORT ============
    // HOW TO APPROACH:
    // Step 1: Find maximum number to know number of digits
    // Step 2: Sort by 1st digit (ones place) - use counting sort
    // Step 3: Sort by 2nd digit (tens place) - use counting sort
    // Step 4: Continue for all digits from least to most significant
    // Step 5: Array is now sorted
    //
    // Idea: Sort by digits from least to most significant
    // Comparison: O(n*k) where k is number of digits - No comparisons needed
    // Best for: Integers, fixed-length strings, when comparison is expensive
    public static void radixSort(int[] arr) {
        if (arr.length == 0) return;

        int max = Arrays.stream(arr).max().orElse(0);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    // ============ 7. BUCKET SORT ============
    // HOW TO APPROACH:
    // Step 1: Determine number of buckets based on input range
    // Step 2: Distribute elements into appropriate buckets
    // Step 3: Sort individual buckets (using any sorting algorithm)
    // Step 4: Concatenate all sorted buckets together
    // Step 5: Result is fully sorted
    //
    // Idea: Distribute elements into buckets and sort each bucket
    // Comparison: O(n+k) average - Good for uniformly distributed data
    // Best for: Uniformly distributed data, floating-point numbers
    public static void bucketSort(int[] arr) {
        if (arr.length == 0) return;

        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);
        int bucketCount = (max - min) / arr.length + 1;

        @SuppressWarnings("unchecked")
        java.util.List<Integer>[] buckets = new java.util.ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new java.util.ArrayList<>();
        }

        for (int num : arr) {
            int idx = (num - min) / (arr.length);
            buckets[idx].add(num);
        }

        for (java.util.List<Integer> bucket : buckets) {
            bucket.sort(null);
        }

        int index = 0;
        for (java.util.List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    // ============ MAIN - TEST ALL SORTS ============
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr3 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr4 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr5 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr6 = {170, 45, 75, 90, 2, 8, 2, 7};
        int[] arr7 = {95, 54, 28, 15, 89, 11, 47};

        System.out.println("=== SORTING ALGORITHMS DEMO ===\n");

        System.out.println("1. BUBBLE SORT");
        bubbleSort(arr1);
        System.out.println("   Result: " + Arrays.toString(arr1) + "\n");

        System.out.println("2. SELECTION SORT");
        selectionSort(arr2);
        System.out.println("   Result: " + Arrays.toString(arr2) + "\n");

        System.out.println("3. INSERTION SORT");
        insertionSort(arr3);
        System.out.println("   Result: " + Arrays.toString(arr3) + "\n");

        System.out.println("4. QUICK SORT");
        quickSort(arr4);
        System.out.println("   Result: " + Arrays.toString(arr4) + "\n");

        System.out.println("5. MERGE SORT");
        mergeSort(arr5);
        System.out.println("   Result: " + Arrays.toString(arr5) + "\n");

        System.out.println("6. RADIX SORT");
        radixSort(arr6);
        System.out.println("   Result: " + Arrays.toString(arr6) + "\n");

        System.out.println("7. BUCKET SORT");
        bucketSort(arr7);
        System.out.println("   Result: " + Arrays.toString(arr7) + "\n");
    }
}
