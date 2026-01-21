// SET IMPLEMENTATIONS - HashSet, LinkedHashSet, TreeSet
package Collections.Set;

import java.util.*;

public class SetImplementations {
    public static void main(String[] args) {
        System.out.println("===== SET IMPLEMENTATIONS =====\n");
        
        hashSetPrograms();
        linkedHashSetPrograms();
        treeSetPrograms();
        setOperations();
        comparisonOfSets();
    }
    
    public static void hashSetPrograms() {
        System.out.println("\n--- HASHSET PROGRAMS ---");
        
        System.out.println("\n1. Basic Operations (No Duplicates)");
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        
        System.out.println("\n2. Remove Elements");
        set.remove(20);
        System.out.println("After remove(20): " + set);
        
        System.out.println("\n3. Check Existence");
        System.out.println("Contains 30: " + set.contains(30));
        System.out.println("Contains 99: " + set.contains(99));
        
        System.out.println("\n4. Find Unique Elements");
        HashSet<Character> chars = new HashSet<>();
        String str = "programming";
        for(char c : str.toCharArray()) {
            chars.add(c);
        }
        System.out.println("String: " + str);
        System.out.println("Unique characters: " + chars);
        
        System.out.println("\n5. Remove All Vowels");
        HashSet<Character> letters = new HashSet<>();
        String word = "beautiful";
        for(char c : word.toCharArray()) {
            letters.add(c);
        }
        letters.removeAll(Set.of('a', 'e', 'i', 'o', 'u'));
        System.out.println("Word: " + word);
        System.out.println("After removing vowels: " + letters);
    }
    
    public static void linkedHashSetPrograms() {
        System.out.println("\n--- LINKEDHASHSET PROGRAMS (Maintains Insertion Order) ---");
        
        System.out.println("\n1. Insertion Order Preserved");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored
        System.out.println("LinkedHashSet: " + set);
        System.out.println("Note: Maintains insertion order");
        
        System.out.println("\n2. Access in Order");
        System.out.print("Iterating: ");
        for(String item : set) {
            System.out.print(item + " -> ");
        }
        System.out.println("END");
        
        System.out.println("\n3. Remove Duplicates (Preserve Order)");
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        System.out.println("Original: [1, 2, 2, 3, 3, 3, 4]");
        System.out.println("After LinkedHashSet: " + unique);
    }
    
    public static void treeSetPrograms() {
        System.out.println("\n--- TREESET PROGRAMS (Sorted/Ordered) ---");
        
        System.out.println("\n1. Sorted Order");
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println("TreeSet (sorted): " + set);
        
        System.out.println("\n2. First and Last");
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        
        System.out.println("\n3. Ceiling and Floor");
        System.out.println("Ceiling(25): " + set.ceiling(25)); // >= 25
        System.out.println("Floor(25): " + set.floor(25));     // <= 25
        
        System.out.println("\n4. Range Operations");
        System.out.println("HeadSet(30): " + set.headSet(30));      // < 30
        System.out.println("TailSet(30): " + set.tailSet(30));      // >= 30
        System.out.println("SubSet(20, 40): " + set.subSet(20, 40)); // [20, 40)
        
        System.out.println("\n5. Descending Order");
        TreeSet<String> letters = new TreeSet<>(Set.of("Z", "A", "M", "B"));
        System.out.println("Natural order: " + letters);
        System.out.println("Descending order: " + letters.descendingSet());
        
        System.out.println("\n6. Reverse Comparator");
        TreeSet<Integer> descending = new TreeSet<>(Comparator.reverseOrder());
        descending.addAll(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Descending TreeSet: " + descending);
    }
    
    public static void setOperations() {
        System.out.println("\n\n--- SET OPERATIONS ---");
        
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        
        System.out.println("\n1. Union (addAll)");
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        System.out.println("\n2. Intersection (retainAll)");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        System.out.println("\n3. Difference (removeAll)");
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Set1 - Set2: " + difference);
        
        System.out.println("\n4. Check Subset");
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        System.out.println("Is " + subset + " subset of Set1: " + set1.containsAll(subset));
    }
    
    public static void comparisonOfSets() {
        System.out.println("\n\n===== SET COMPARISON =====");
        System.out.println("\nHashSet:");
        System.out.println("- Hash table based, unordered");
        System.out.println("- Best performance O(1) operations");
        System.out.println("- No order guarantee");
        System.out.println("- Use when order doesn't matter");
        
        System.out.println("\nLinkedHashSet:");
        System.out.println("- Hash table + doubly linked list");
        System.out.println("- Maintains insertion order");
        System.out.println("- O(1) operations, slightly slower than HashSet");
        System.out.println("- Use when insertion order is needed");
        
        System.out.println("\nTreeSet:");
        System.out.println("- Red-Black tree based, sorted");
        System.out.println("- O(log n) operations");
        System.out.println("- Elements in sorted order");
        System.out.println("- Use when sorted unique elements needed");
    }
}
