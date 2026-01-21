// ArrayList Programs - Dynamic Array Implementation
package Collections.List;

import java.util.*;

public class ArrayListPrograms {
    public static void main(String[] args) {
        System.out.println("===== ARRAYLIST PROGRAMS =====\n");
        
        basicOperations();
        arrayListMethods();
        findDuplicates();
        rotateArray();
        frequencyCounter();
        twoSum();
        removeElement();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));
    }
    
    public static void arrayListMethods() {
        System.out.println("\n--- ARRAYLIST METHODS ---");
        ArrayList<String> fruits = new ArrayList<>();
        
        System.out.println("1. add(E element)");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("   " + fruits);
        
        System.out.println("\n2. add(int index, E element)");
        fruits.add(1, "Blueberry");
        System.out.println("   " + fruits);
        
        System.out.println("\n3. get(int index)");
        System.out.println("   Element at 2: " + fruits.get(2));
        
        System.out.println("\n4. set(int index, E element)");
        fruits.set(0, "Apricot");
        System.out.println("   " + fruits);
        
        System.out.println("\n5. remove(int index)");
        fruits.remove(1);
        System.out.println("   " + fruits);
        
        System.out.println("\n6. contains(Object o)");
        System.out.println("   Contains 'Banana': " + fruits.contains("Banana"));
        
        System.out.println("\n7. indexOf(Object o)");
        System.out.println("   Index of 'Cherry': " + fruits.indexOf("Cherry"));
        
        System.out.println("\n8. isEmpty() and clear()");
        ArrayList<String> temp = new ArrayList<>(fruits);
        System.out.println("   Before clear: " + temp.size());
        temp.clear();
        System.out.println("   After clear: " + temp.size());
    }
    
    public static void findDuplicates() {
        System.out.println("\n--- FIND DUPLICATES ---");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5));
        
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        
        for(int n : nums) {
            if(!seen.add(n)) {
                duplicates.add(n);
            }
        }
        
        System.out.println("Array: " + nums);
        System.out.println("Duplicates: " + duplicates);
    }
    
    public static void rotateArray() {
        System.out.println("\n--- ROTATE ARRAY ---");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        
        System.out.println("Original: " + list);
        System.out.println("Rotate by " + k);
        Collections.rotate(list, k);
        System.out.println("Result: " + list);
    }
    
    public static void frequencyCounter() {
        System.out.println("\n--- FREQUENCY COUNTER ---");
        ArrayList<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana", "Apple"));
        
        HashMap<String, Integer> freq = new HashMap<>();
        for(String item : items) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        
        System.out.println("Items: " + items);
        System.out.println("Frequency:");
        for(Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void twoSum() {
        System.out.println("\n--- TWO SUM PROBLEM ---");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if(map.containsKey(complement)) {
                System.out.println("Array: " + nums);
                System.out.println("Target: " + target);
                System.out.println("Indices: [" + map.get(complement) + ", " + i + "]");
                System.out.println("Numbers: [" + complement + ", " + nums.get(i) + "]");
                return;
            }
            map.put(nums.get(i), i);
        }
    }
    
    public static void removeElement() {
        System.out.println("\n--- REMOVE ELEMENT ---");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 2, 2, 3));
        int val = 3;
        
        System.out.println("Original: " + nums);
        System.out.println("Remove: " + val);
        
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            if(it.next() == val) {
                it.remove();
            }
        }
        
        System.out.println("After removal: " + nums);
    }
}
