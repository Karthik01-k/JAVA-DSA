// Map Interface - Key-Value Pairs with No Duplicate Keys
// Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable, WeakHashMap
// Key Methods Documentation

package Collections.Interfaces;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        System.out.println("===== MAP INTERFACE METHODS =====\n");
        
        Map<String, Integer> map = new HashMap<>();
        
        System.out.println("1. put(K key, V value) - Insert/Update: O(1)");
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        System.out.println("   " + map);
        
        System.out.println("\n2. putAll(Map m) - Insert all: O(n)");
        map.putAll(Map.of("Date", 40, "Elderberry", 50));
        System.out.println("   " + map);
        
        System.out.println("\n3. get(Object key) - Get value: O(1)");
        System.out.println("   Value of 'Banana': " + map.get("Banana"));
        System.out.println("   Value of 'Grape': " + map.get("Grape"));
        
        System.out.println("\n4. getOrDefault(Object key, V defaultValue)");
        System.out.println("   Value of 'Grape' or default 0: " + map.getOrDefault("Grape", 0));
        
        System.out.println("\n5. containsKey(Object key) - Check key: O(1)");
        System.out.println("   Contains 'Apple': " + map.containsKey("Apple"));
        System.out.println("   Contains 'Grape': " + map.containsKey("Grape"));
        
        System.out.println("\n6. containsValue(Object value) - Check value: O(n)");
        System.out.println("   Contains value 20: " + map.containsValue(20));
        System.out.println("   Contains value 99: " + map.containsValue(99));
        
        System.out.println("\n7. remove(Object key) - Remove by key: O(1)");
        map.remove("Date");
        System.out.println("   " + map);
        
        System.out.println("\n8. keySet() - Get all keys: O(1)");
        System.out.println("   Keys: " + map.keySet());
        
        System.out.println("\n9. values() - Get all values: O(1)");
        System.out.println("   Values: " + map.values());
        
        System.out.println("\n10. entrySet() - Get all key-value pairs: O(1)");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("    " + entry.getKey() + " -> " + entry.getValue());
        }
        
        System.out.println("\n11. size() - Get size: O(1)");
        System.out.println("   Size: " + map.size());
        
        System.out.println("\n12. clear() - Remove all: O(n)");
        Map<String, Integer> temp = new HashMap<>(map);
        temp.clear();
        System.out.println("   After clear: " + temp);
        
        System.out.println("\n=== IMPLEMENTATIONS ===");
        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
    }
    
    public static void demonstrateHashMap() {
        System.out.println("\n--- HashMap (Hash Table) ---");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 78);
        System.out.println("HashMap: " + map);
        System.out.println("Time: put O(1), get O(1), remove O(1)");
        System.out.println("Order: Random (unordered)");
        System.out.println("Best for: Fast key-value lookup");
    }
    
    public static void demonstrateLinkedHashMap() {
        System.out.println("\n--- LinkedHashMap (Hash Table + LinkedList) ---");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 78);
        System.out.println("LinkedHashMap: " + map);
        System.out.println("Time: put O(1), get O(1), remove O(1)");
        System.out.println("Order: Insertion order");
        System.out.println("Best for: Insertion-ordered access");
    }
    
    public static void demonstrateTreeMap() {
        System.out.println("\n--- TreeMap (Red-Black Tree) ---");
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 78);
        System.out.println("TreeMap: " + map);
        System.out.println("Time: put O(log n), get O(log n), remove O(log n)");
        System.out.println("Order: Sorted by key");
        System.out.println("Best for: Sorted key-value pairs");
    }
}
