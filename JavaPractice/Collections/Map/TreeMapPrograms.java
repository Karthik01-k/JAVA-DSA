// TreeMap Programs - Sorted Map Implementation
package Collections.Map;

import java.util.*;

public class TreeMapPrograms {
    public static void main(String[] args) {
        System.out.println("===== TREEMAP PROGRAMS =====\n");
        
        sortedByKey();
        navigationMethods();
        rangeOperations();
        customComparator();
        descendingOrder();
        studentMarksExample();
    }
    
    public static void sortedByKey() {
        System.out.println("\n--- SORTED BY KEY ---");
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("Zebra", 5);
        map.put("Apple", 1);
        map.put("Monkey", 3);
        map.put("Banana", 2);
        
        System.out.println("TreeMap (sorted by key):");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void navigationMethods() {
        System.out.println("\n--- NAVIGATION METHODS ---");
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(
            10, "Ten",
            20, "Twenty",
            30, "Thirty",
            40, "Forty",
            50, "Fifty"
        ));
        
        System.out.println("TreeMap: " + map);
        
        System.out.println("\nfirstKey(): " + map.firstKey());
        System.out.println("lastKey(): " + map.lastKey());
        System.out.println("firstEntry(): " + map.firstEntry());
        System.out.println("lastEntry(): " + map.lastEntry());
        
        System.out.println("\nlowerKey(30): " + map.lowerKey(30));
        System.out.println("higherKey(30): " + map.higherKey(30));
        System.out.println("floorKey(25): " + map.floorKey(25));
        System.out.println("ceilingKey(25): " + map.ceilingKey(25));
    }
    
    public static void rangeOperations() {
        System.out.println("\n--- RANGE OPERATIONS ---");
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(
            10, "A", 20, "B", 30, "C", 40, "D", 50, "E"
        ));
        
        System.out.println("TreeMap: " + map);
        
        System.out.println("\nheadMap(30): " + map.headMap(30));           // < 30
        System.out.println("tailMap(30): " + map.tailMap(30));            // >= 30
        System.out.println("subMap(20, 40): " + map.subMap(20, 40));      // [20, 40)
        
        System.out.println("\nheadMap(30, true): " + map.headMap(30, true));    // <= 30
        System.out.println("subMap(20, true, 40, true): " + 
                          map.subMap(20, true, 40, true));                     // [20, 40]
    }
    
    public static void customComparator() {
        System.out.println("\n--- CUSTOM COMPARATOR ---");
        
        System.out.println("\n1. Reverse Order");
        TreeMap<Integer, String> reverse = new TreeMap<>(Comparator.reverseOrder());
        reverse.put(5, "Five");
        reverse.put(2, "Two");
        reverse.put(8, "Eight");
        reverse.put(1, "One");
        System.out.println("Reverse sorted: " + reverse);
        
        System.out.println("\n2. By String Length");
        TreeMap<String, Integer> byLength = new TreeMap<>(Comparator.comparingInt(String::length));
        byLength.put("a", 1);
        byLength.put("hello", 5);
        byLength.put("hi", 2);
        byLength.put("world", 5);
        System.out.println("By length: " + byLength);
        
        System.out.println("\n3. Custom Comparator with Secondary Sort");
        TreeMap<String, Integer> custom = new TreeMap<>((s1, s2) -> {
            int lenCompare = Integer.compare(s1.length(), s2.length());
            if(lenCompare == 0) return s1.compareTo(s2);
            return lenCompare;
        });
        custom.put("dog", 3);
        custom.put("cat", 3);
        custom.put("elephant", 8);
        custom.put("bee", 3);
        System.out.println("By length, then alphabetical: " + custom);
    }
    
    public static void descendingOrder() {
        System.out.println("\n--- DESCENDING ORDER ---");
        TreeMap<String, Integer> map = new TreeMap<>(Map.of(
            "Apple", 10,
            "Banana", 20,
            "Cherry", 30,
            "Date", 40
        ));
        
        System.out.println("Ascending: " + map);
        System.out.println("Descending: " + map.descendingMap());
    }
    
    public static void studentMarksExample() {
        System.out.println("\n--- STUDENT MARKS TRACKER ---");
        TreeMap<String, Integer> marks = new TreeMap<>();
        
        marks.put("Zoe", 85);
        marks.put("Alice", 90);
        marks.put("Charlie", 78);
        marks.put("Bob", 88);
        
        System.out.println("Students (alphabetical order):");
        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println("\nTop performer: " + 
            marks.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(e -> e.getKey() + " (" + e.getValue() + ")")
                .orElse("N/A"));
        
        System.out.println("\nRange (Alice to Charlie):");
        marks.subMap("Alice", "Charlie").forEach((k, v) -> 
            System.out.println("  " + k + ": " + v)
        );
    }
}
