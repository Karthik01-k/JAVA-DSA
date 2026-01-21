// Collections Framework: ArrayList operations
// Similar to LeetCode problems using dynamic arrays
// Related: LeetCode 380 - Insert Delete GetRandom O(1)
// https://leetcode.com/problems/insert-delete-getrandom-o1/
//
// APPROACH (Dynamic Array Operations):
// 1. Create ArrayList object with generic type
// 2. Use add() method to insert elements at end
// 3. Use get(index) to access elements by position
// 4. Use remove(index) to delete elements
// 5. Use size() to get current number of elements
// 6. ArrayList automatically resizes as needed

import java.util.*;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        
        list.remove(1);
        System.out.println("After removal: " + list);
    }
}