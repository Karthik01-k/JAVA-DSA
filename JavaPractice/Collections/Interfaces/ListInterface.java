// List Interface - Ordered Collection with Duplicate Elements Allowed
// Implementations: ArrayList, LinkedList, Vector, CopyOnWriteArrayList
// Key Methods Documentation

// package Collections.Interfaces;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        System.out.println("===== LIST INTERFACE METHODS =====\n");
        
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        System.out.println("1. add(E element) - Add at end: O(1)");
        list.add(60);
        System.out.println("   " + list);
        
        System.out.println("\n2. add(int index, E element) - Add at index: O(n)");
        list.add(2, 25);
        System.out.println("   " + list);
        
        System.out.println("\n3. addAll(Collection c) - Add all: O(n)");
        list.addAll(Arrays.asList(70, 80));
        System.out.println("   " + list);
        
        System.out.println("\n4. get(int index) - Get element: O(1)");
        System.out.println("   Element at index 3: " + list.get(3));
        
        System.out.println("\n5. set(int index, E element) - Replace: O(1)");
        list.set(0, 100);
        System.out.println("   " + list);
        
        System.out.println("\n6. remove(int index) - Remove at index: O(n)");
        list.remove(5);
        System.out.println("   " + list);
        
        System.out.println("\n7. indexOf(Object o) - First occurrence: O(n)");
        System.out.println("   Index of 30: " + list.indexOf(30));
        
        System.out.println("\n8. lastIndexOf(Object o) - Last occurrence: O(n)");
        list.add(30);
        System.out.println("   Last index of 30: " + list.lastIndexOf(30));
        
        System.out.println("\n9. subList(int fromIndex, int toIndex) - Sublist: O(1) view");
        System.out.println("   SubList(1, 4): " + list.subList(1, 4));
        
        System.out.println("\n10. listIterator() - Bidirectional iterator");
        ListIterator<Integer> iter = list.listIterator();
        System.out.print("    Forward: ");
        while(iter.hasNext()) System.out.print(iter.next() + " ");
        System.out.println();
        
        System.out.println("\n=== IMPLEMENTATIONS ===");
        demonstrateArrayList();
        demonstrateLinkedList();
        demonstrateVector();
    }
    
    public static void demonstrateArrayList() {
        System.out.println("\n--- ArrayList (Dynamic Array) ---");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);
        System.out.println("Time: add O(1), get O(1), remove O(n)");
        System.out.println("Best for: Frequent access, few insertions");
    }
    
    public static void demonstrateLinkedList() {
        System.out.println("\n--- LinkedList (Doubly Linked List) ---");
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("LinkedList: " + list);
        System.out.println("Time: add O(1), get O(n), remove O(n)");
        System.out.println("Best for: Frequent insertions/deletions");
    }
    
    public static void demonstrateVector() {
        System.out.println("\n--- Vector (Legacy, Synchronized) ---");
        Vector<String> list = new Vector<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Vector: " + list);
        System.out.println("Time: add O(1), get O(1), remove O(n)");
        System.out.println("Best for: Multi-threaded applications (legacy)");
    }
}
