// MAP IMPLEMENTATIONS - HashMap, LinkedHashMap, TreeMap
package Collections.Map;

import java.util.*;

public class MapImplementations {
    public static void main(String[] args) {
        System.out.println("===== MAP IMPLEMENTATIONS =====\n");
        
        hashMapPrograms();
        linkedHashMapPrograms();
        treeMapPrograms();
        advancedMapOperations();
        comparisonOfMaps();
    }
    
    public static void hashMapPrograms() {
        System.out.println("\n--- HASHMAP PROGRAMS ---");
        
        System.out.println("\n1. Basic Operations");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        System.out.println("HashMap: " + map);
        
        System.out.println("\n2. Get with Default Value");
        System.out.println("Apple value: " + map.get("Apple"));
        System.out.println("Grape value (default 0): " + map.getOrDefault("Grape", 0));
        
        System.out.println("\n3. Update Value");
        map.put("Apple", 15); // Update
        System.out.println("After update: " + map);
        
        System.out.println("\n4. Iterate Over Keys, Values, Entries");
        System.out.print("Keys: ");
        map.keySet().forEach(k -> System.out.print(k + " "));
        System.out.println();
        
        System.out.print("Values: ");
        map.values().forEach(v -> System.out.print(v + " "));
        System.out.println();
        
        System.out.print("Entries: ");
        map.entrySet().forEach(e -> System.out.print(e.getKey() + "=" + e.getValue() + " "));
        System.out.println();
        
        System.out.println("\n5. Word Frequency");
        String text = "hello world hello java world";
        HashMap<String, Integer> frequency = new HashMap<>();
        for(String word : text.split(" ")) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        System.out.println("Text: " + text);
        System.out.println("Frequency: " + frequency);
        
        System.out.println("\n6. Merge and Replace");
        map.putIfAbsent("Date", 40);
        System.out.println("After putIfAbsent: " + map);
        
        System.out.println("\n7. Remove");
        map.remove("Banana");
        System.out.println("After remove: " + map);
    }
    
    public static void linkedHashMapPrograms() {
        System.out.println("\n--- LINKEDHASHMAP PROGRAMS (Maintains Insertion Order) ---");
        
        System.out.println("\n1. Insertion Order Preserved");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        System.out.println("LinkedHashMap: " + map);
        System.out.println("Note: Insertion order maintained");
        
        System.out.println("\n2. Access Order LinkedHashMap");
        LinkedHashMap<String, Integer> accessOrder = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 3; // LRU cache with 3 items
            }
        };
        accessOrder.put("A", 1);
        accessOrder.put("B", 2);
        accessOrder.put("C", 3);
        System.out.println("After adding A, B, C: " + accessOrder);
        
        accessOrder.get("A"); // Access A
        System.out.println("After accessing A: " + accessOrder);
        
        accessOrder.put("D", 4); // This will remove eldest (B)
        System.out.println("After adding D: " + accessOrder);
        
        System.out.println("\n3. Recently Used Items Tracker");
        LinkedHashMap<String, Long> tracker = new LinkedHashMap<>();
        tracker.put("File1", System.currentTimeMillis());
        tracker.put("File2", System.currentTimeMillis());
        tracker.put("File3", System.currentTimeMillis());
        System.out.println("Accessed files in order: " + tracker.keySet());
    }
    
    public static void treeMapPrograms() {
        System.out.println("\n--- TREEMAP PROGRAMS (Sorted by Key) ---");
        
        System.out.println("\n1. Sorted by Key");
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Zebra", 5);
        map.put("Apple", 1);
        map.put("Monkey", 3);
        map.put("Banana", 2);
        System.out.println("TreeMap (sorted by key): " + map);
        
        System.out.println("\n2. First and Last Entry");
        System.out.println("First: " + map.firstEntry());
        System.out.println("Last: " + map.lastEntry());
        
        System.out.println("\n3. Head, Tail, Sub Maps");
        System.out.println("Head (before 'Monkey'): " + map.headMap("Monkey"));
        System.out.println("Tail (from 'Monkey'): " + map.tailMap("Monkey"));
        System.out.println("Sub (Apple to Monkey): " + map.subMap("Apple", "Monkey"));
        
        System.out.println("\n4. Descending Order");
        TreeMap<Integer, String> descending = new TreeMap<>(Comparator.reverseOrder());
        descending.put(3, "Three");
        descending.put(1, "One");
        descending.put(2, "Two");
        System.out.println("Descending TreeMap: " + descending);
        
        System.out.println("\n5. Student Marks (Sorted by Name)");
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Charlie", 85);
        marks.put("Alice", 90);
        marks.put("Bob", 88);
        System.out.println("Students (sorted): " + marks);
        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void advancedMapOperations() {
        System.out.println("\n\n--- ADVANCED MAP OPERATIONS ---");
        
        System.out.println("\n1. putIfAbsent - Add only if key not present");
        HashMap<String, Integer> map = new HashMap<>();
        map.putIfAbsent("A", 1);
        map.putIfAbsent("A", 2); // Won't update
        System.out.println("After putIfAbsent: " + map);
        
        System.out.println("\n2. compute - Compute value based on key");
        map.compute("A", (k, v) -> v == null ? 1 : v + 10);
        System.out.println("After compute: " + map);
        
        System.out.println("\n3. merge - Merge with default value");
        map.merge("B", 5, Integer::sum);
        map.merge("B", 3, Integer::sum);
        System.out.println("After merge: " + map);
        
        System.out.println("\n4. forEach with lambda");
        System.out.print("Items: ");
        map.forEach((k, v) -> System.out.print(k + ":" + v + " "));
        System.out.println();
        
        System.out.println("\n5. Filter Map by Value");
        HashMap<String, Integer> scores = new HashMap<>(Map.of("A", 50, "B", 80, "C", 90, "D", 40));
        HashMap<String, Integer> passing = new HashMap<>();
        scores.forEach((k, v) -> {
            if(v >= 60) passing.put(k, v);
        });
        System.out.println("All scores: " + scores);
        System.out.println("Passing (>=60): " + passing);
    }
    
    public static void comparisonOfMaps() {
        System.out.println("\n\n===== MAP COMPARISON =====");
        System.out.println("\nHashMap:");
        System.out.println("- Hash table based, unordered");
        System.out.println("- Best performance O(1) operations");
        System.out.println("- Null key and null values allowed");
        System.out.println("- Not synchronized");
        System.out.println("- Use for fast key-value lookups");
        
        System.out.println("\nLinkedHashMap:");
        System.out.println("- Hash table + doubly linked list");
        System.out.println("- Maintains insertion order");
        System.out.println("- O(1) operations");
        System.out.println("- Can be used as LRU cache");
        System.out.println("- Use when order is needed");
        
        System.out.println("\nTreeMap:");
        System.out.println("- Red-Black tree based, sorted");
        System.out.println("- O(log n) operations");
        System.out.println("- Keys in sorted (natural or custom) order");
        System.out.println("- No null keys allowed");
        System.out.println("- Use for sorted key-value pairs");
    }
}
