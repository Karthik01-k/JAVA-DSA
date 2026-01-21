// Set Interface - Unordered Collection with No Duplicates
// Implementations: HashSet, LinkedHashSet, TreeSet, CopyOnWriteArraySet
// Key Methods Documentation

package Collections.Interfaces;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        System.out.println("===== SET INTERFACE METHODS =====\n");
        
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        
        System.out.println("1. add(E element) - Add element: O(1)");
        set.add(60);
        System.out.println("   " + set);
        
        System.out.println("\n2. addAll(Collection c) - Add all: O(n)");
        set.addAll(Arrays.asList(70, 80));
        System.out.println("   " + set);
        
        System.out.println("\n3. contains(Object o) - Check existence: O(1)");
        System.out.println("   Contains 30: " + set.contains(30));
        System.out.println("   Contains 99: " + set.contains(99));
        
        System.out.println("\n4. remove(Object o) - Remove element: O(1)");
        set.remove(20);
        System.out.println("   " + set);
        
        System.out.println("\n5. size() - Get size: O(1)");
        System.out.println("   Size: " + set.size());
        
        System.out.println("\n6. isEmpty() - Check if empty: O(1)");
        System.out.println("   Is empty: " + set.isEmpty());
        
        System.out.println("\n7. clear() - Remove all: O(n)");
        Set<Integer> temp = new HashSet<>(set);
        temp.clear();
        System.out.println("   After clear: " + temp);
        
        System.out.println("\n8. iterator() - Iterate: O(n)");
        System.out.print("   Elements: ");
        set.iterator().forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();
        
        // Set Operations
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        
        System.out.println("\n9. retainAll(Collection c) - Intersection: O(n)");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("   Set1: " + set1);
        System.out.println("   Set2: " + set2);
        System.out.println("   Intersection: " + intersection);
        
        System.out.println("\n10. removeAll(Collection c) - Difference: O(n)");
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("    Difference (Set1 - Set2): " + difference);
        
        System.out.println("\n=== IMPLEMENTATIONS ===");
        demonstrateHashSet();
        demonstrateLinkedHashSet();
        demonstrateTreeSet();
    }
    
    public static void demonstrateHashSet() {
        System.out.println("\n--- HashSet (Hash Table) ---");
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored
        System.out.println("HashSet: " + set);
        System.out.println("Time: add O(1), remove O(1), contains O(1)");
        System.out.println("Order: Random (unordered)");
        System.out.println("Best for: No duplicates, fast lookup");
    }
    
    public static void demonstrateLinkedHashSet() {
        System.out.println("\n--- LinkedHashSet (Hash Table + LinkedList) ---");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("LinkedHashSet: " + set);
        System.out.println("Time: add O(1), remove O(1), contains O(1)");
        System.out.println("Order: Insertion order");
        System.out.println("Best for: Insertion-ordered, no duplicates");
    }
    
    public static void demonstrateTreeSet() {
        System.out.println("\n--- TreeSet (Red-Black Tree) ---");
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("TreeSet: " + set);
        System.out.println("Time: add O(log n), remove O(log n), contains O(log n)");
        System.out.println("Order: Sorted (natural order)");
        System.out.println("Best for: Sorted unique elements");
    }
}
