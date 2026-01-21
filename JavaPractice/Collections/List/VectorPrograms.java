// Vector Programs - Legacy Synchronized List
package Collections.List;

import java.util.*;

public class VectorPrograms {
    public static void main(String[] args) {
        System.out.println("===== VECTOR PROGRAMS (Legacy) =====\n");
        
        System.out.println("WARNING: Vector is a legacy class from Java 1.0");
        System.out.println("It's synchronized, making it slower than ArrayList");
        System.out.println("Use ArrayList or Collections.synchronizedList() instead\n");
        
        basicOperations();
        capacityManagement();
        enumerationVsIterator();
        synchronizationDemo();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");
        Vector<Double> vector = new Vector<>();
        
        vector.add(1.5);
        vector.add(2.5);
        vector.add(3.5);
        
        System.out.println("Vector: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Element at 1: " + vector.get(1));
    }
    
    public static void capacityManagement() {
        System.out.println("\n--- CAPACITY MANAGEMENT ---");
        Vector<Integer> vec = new Vector<>(5);
        
        System.out.println("Initial capacity: " + vec.capacity());
        
        for(int i = 1; i <= 10; i++) {
            vec.add(i * 10);
        }
        
        System.out.println("After adding 10 elements:");
        System.out.println("Size: " + vec.size());
        System.out.println("Capacity: " + vec.capacity());
        
        System.out.println("\nTrim to size:");
        vec.trimToSize();
        System.out.println("Capacity after trim: " + vec.capacity());
        
        System.out.println("\nEnsure capacity:");
        vec.ensureCapacity(50);
        System.out.println("Capacity after ensure: " + vec.capacity());
    }
    
    public static void enumerationVsIterator() {
        System.out.println("\n--- ENUMERATION vs ITERATOR ---");
        Vector<String> vector = new Vector<>(Arrays.asList("A", "B", "C"));
        
        System.out.println("\n1. Using Enumeration (Legacy)");
        System.out.print("   Enumeration: ");
        Enumeration<String> enum1 = vector.elements();
        while(enum1.hasMoreElements()) {
            System.out.print(enum1.nextElement() + " ");
        }
        System.out.println();
        
        System.out.println("\n2. Using Iterator (Modern)");
        System.out.print("   Iterator: ");
        Iterator<String> iter = vector.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        
        System.out.println("\n3. Using forEach (Recommended)");
        System.out.print("   forEach: ");
        vector.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
    
    public static void synchronizationDemo() {
        System.out.println("\n--- SYNCHRONIZATION ---");
        System.out.println("Vector is synchronized (thread-safe):");
        System.out.println("- All methods are synchronized");
        System.out.println("- Performance penalty for single-threaded code");
        System.out.println("- Better alternatives:");
        System.out.println("  1. ArrayList (most cases)");
        System.out.println("  2. Collections.synchronizedList(new ArrayList<>())");
        System.out.println("  3. CopyOnWriteArrayList (for heavy reading)");
        
        System.out.println("\nExample of synchronized list:");
        Vector<String> syncVec = new Vector<>();
        syncVec.add("Thread-safe");
        syncVec.add("But slow");
        System.out.println("Vector: " + syncVec);
    }
}
