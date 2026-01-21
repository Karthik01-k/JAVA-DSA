// LinkedHashSet Programs - Hash Table + LinkedList Set
package Collections.Set;

import java.util.*;

public class LinkedHashSetPrograms {
    public static void main(String[] args) {
        System.out.println("===== LINKEDHASHSET PROGRAMS =====\n");
        
        insertionOrder();
        removeDuplicatesPreservingOrder();
        accessOrder();
        iterationExample();
    }
    
    public static void insertionOrder() {
        System.out.println("\n--- INSERTION ORDER PRESERVED ---");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate, not added again
        set.add("Date");
        
        System.out.println("Added: Apple, Banana, Cherry, Apple, Date");
        System.out.println("LinkedHashSet: " + set);
        System.out.println("Note: Insertion order maintained, no duplicates");
    }
    
    public static void removeDuplicatesPreservingOrder() {
        System.out.println("\n--- REMOVE DUPLICATES (Preserve Order) ---");
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        for(int n : arr) {
            unique.add(n);
        }
        
        System.out.println("After LinkedHashSet: " + unique);
        System.out.println("Order: Preserved");
    }
    
    public static void accessOrder() {
        System.out.println("\n--- ACCESS-ORDER vs INSERTION-ORDER ---");
        
        System.out.println("\n1. Insertion-Order (default)");
        LinkedHashSet<Integer> insertionOrder = new LinkedHashSet<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2));
        System.out.println("Added: 3, 1, 4, 1, 5, 9, 2");
        System.out.println("Result: " + insertionOrder);
        
        System.out.println("\n2. Access-Order (using LinkedHashMap)");
        System.out.println("LinkedHashSet doesn't support access-order");
        System.out.println("Use LinkedHashMap(capacity, loadFactor, accessOrder=true)");
    }
    
    public static void iterationExample() {
        System.out.println("\n--- ITERATION IN ORDER ---");
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Berlin");
        
        System.out.println("Cities in insertion order:");
        System.out.print("Using for-each: ");
        for(String city : cities) {
            System.out.print(city + " -> ");
        }
        System.out.println("END");
        
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = cities.iterator();
        while(it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
