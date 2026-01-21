// Collections Framework: HashMap for frequency counting
// Similar to LeetCode frequency problems
// Related: LeetCode 347 - Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
//
// PATTERN RECOGNITION:
// - Need to count occurrences of each element
// - Want fast lookup and insertion operations
// - Pattern: "Hash Map" - key-value mapping for O(1) operations
// - Key insight: use element as key, frequency as value
// - Similar problems: Group Anagrams, Word Pattern, Isomorphic Strings
//
// BRUTE FORCE APPROACH:
// 1. Use nested loops: for each element, count occurrences in array
// 2. for i=0 to n-1, for j=0 to n-1, if arr[i] == arr[j] increment count
// 3. Time: O(n²), Space: O(1)
/*
for (int i = 0; i < arr.length; i++) {
    int count = 0;
    for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) count++;
    }
    System.out.println(arr[i] + ": " + count);
}
*/
//
// OPTIMIZED APPROACH (Hash Map for Counting):
// 1. Create HashMap with key=element, value=frequency
// 2. Iterate through array elements
// 3. Use getOrDefault(key, 0) to get current count or 0
// 4. Increment count and put back in map
// 5. Iterate through map entries to find patterns
// 6. Time: O(n), Space: O(n)
/*
Map<Integer, Integer> freq = new HashMap<>();
for (int num : arr) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
*/
//
// EDGE CASES:
// - Empty array
// - Array with all same elements
// - Array with all unique elements
// - Single element array

import java.util.*;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Frequency map: " + freq);
        
        // Find most frequent element
        int maxFreq = 0, mostFrequent = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent: " + mostFrequent + " (appears " + maxFreq + " times)");
    }
}