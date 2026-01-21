// LIST IMPLEMENTATIONS - ArrayList, LinkedList, Vector
package Collections.List;

import java.util.*;

public class ListImplementations {
    public static void main(String[] args) {
        System.out.println("===== LIST IMPLEMENTATIONS =====\n");
        
        // ArrayList Program
        arrayListPrograms();
        
        // LinkedList Program
        linkedListPrograms();
        
        // Vector Program
        vectorPrograms();
        
        // Comparison
        comparisonOfLists();
    }
    
    public static void arrayListPrograms() {
        System.out.println("\n--- ARRAYLIST PROGRAMS ---");
        
        System.out.println("\n1. Basic Operations");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("ArrayList: " + arr);
        
        System.out.println("\n2. Find Duplicates");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for(int n : nums) {
            if(!seen.add(n)) duplicates.add(n);
        }
        System.out.println("Array: " + nums);
        System.out.println("Duplicates: " + duplicates);
        
        System.out.println("\n3. Rotate ArrayList");
        ArrayList<Integer> rotate = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        Collections.rotate(rotate, k);
        System.out.println("Original: [1, 2, 3, 4, 5]");
        System.out.println("Rotated by " + k + ": " + rotate);
        
        System.out.println("\n4. Frequency of Elements");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana", "Apple"));
        for(String fruit : new HashSet<>(fruits)) {
            System.out.println(fruit + ": " + Collections.frequency(fruits, fruit));
        }
    }
    
    public static void linkedListPrograms() {
        System.out.println("\n--- LINKEDLIST PROGRAMS ---");
        
        System.out.println("\n1. Basic Operations");
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("LinkedList: " + list);
        
        System.out.println("\n2. Add First and Last");
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After addFirst/addLast: " + list);
        
        System.out.println("\n3. Remove First and Last");
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("Removed first: " + first + ", last: " + last);
        System.out.println("Remaining: " + list);
        
        System.out.println("\n4. Queue Operations");
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1); // Enqueue
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue: " + queue.poll()); // FIFO
        System.out.println("Remaining: " + queue);
        
        System.out.println("\n5. Stack Operations");
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1); // Push
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop()); // LIFO
        System.out.println("Remaining: " + stack);
        
        System.out.println("\n6. Reverse LinkedList");
        LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(original);
        System.out.println("Reversed: " + original);
    }
    
    public static void vectorPrograms() {
        System.out.println("\n--- VECTOR PROGRAMS (Legacy, Synchronized) ---");
        
        System.out.println("\n1. Basic Operations");
        Vector<Double> vec = new Vector<>();
        vec.add(1.5);
        vec.add(2.5);
        vec.add(3.5);
        System.out.println("Vector: " + vec);
        System.out.println("Capacity: " + vec.capacity());
        System.out.println("Size: " + vec.size());
        
        System.out.println("\n2. Add Element at Index");
        vec.add(1, 2.0);
        System.out.println("After insertElementAt(1, 2.0): " + vec);
        
        System.out.println("\n3. Set Element");
        vec.setElementAt(5.5, 0);
        System.out.println("After setElementAt(0, 5.5): " + vec);
        
        System.out.println("\n4. Trim Capacity");
        vec.trimToSize();
        System.out.println("Capacity after trimToSize(): " + vec.capacity());
    }
    
    public static void comparisonOfLists() {
        System.out.println("\n\n===== LIST COMPARISON =====");
        System.out.println("\nArrayList:");
        System.out.println("- Backed by dynamic array");
        System.out.println("- Best for random access O(1)");
        System.out.println("- Worst for insertions/deletions O(n)");
        System.out.println("- Not synchronized");
        
        System.out.println("\nLinkedList:");
        System.out.println("- Doubly linked list structure");
        System.out.println("- Best for insertions/deletions at ends O(1)");
        System.out.println("- Worst for random access O(n)");
        System.out.println("- Not synchronized");
        System.out.println("- Implements Queue, Deque");
        
        System.out.println("\nVector:");
        System.out.println("- Like ArrayList but synchronized");
        System.out.println("- Legacy class (pre-Collections)");
        System.out.println("- Slower due to synchronization");
        System.out.println("- Use ArrayList or Collections.synchronizedList() instead");
    }
}
