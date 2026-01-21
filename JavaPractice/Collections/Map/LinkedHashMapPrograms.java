// LinkedHashMap Programs - Hash Table + LinkedList Map
package Collections.Map;

import java.util.*;

public class LinkedHashMapPrograms {
    public static void main(String[] args) {
        System.out.println("===== LINKEDHASHMAP PROGRAMS =====\n");
        
        insertionOrder();
        accessOrder();
        lruCacheImplementation();
        sortedByInsertionOrder();
    }
    
    public static void insertionOrder() {
        System.out.println("\n--- INSERTION ORDER PRESERVED ---");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);
        
        System.out.println("LinkedHashMap (insertion order):");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void accessOrder() {
        System.out.println("\n--- ACCESS ORDER ---");
        System.out.println("LinkedHashMap can be configured for access-order:");
        System.out.println("new LinkedHashMap<>(capacity, loadFactor, accessOrder=true)");
        System.out.println("\nThis tracks which entries were accessed recently");
        System.out.println("Useful for implementing LRU (Least Recently Used) cache");
    }
    
    public static void lruCacheImplementation() {
        System.out.println("\n--- LRU CACHE IMPLEMENTATION ---");
        LRUCache cache = new LRUCache(3);
        
        System.out.println("Cache capacity: 3\n");
        
        cache.put("user1", "Alice");
        System.out.println("Put user1: " + cache.map);
        
        cache.put("user2", "Bob");
        System.out.println("Put user2: " + cache.map);
        
        cache.put("user3", "Charlie");
        System.out.println("Put user3: " + cache.map);
        
        cache.get("user1");
        System.out.println("Get user1 (moves to end): " + cache.map);
        
        cache.put("user4", "David");
        System.out.println("Put user4 (evicts user2): " + cache.map);
        
        System.out.println("\nCache maintains recent access order!");
    }
    
    public static void sortedByInsertionOrder() {
        System.out.println("\n--- ORDERED ITERATION ---");
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        
        System.out.println("HashMap would be unordered");
        System.out.println("LinkedHashMap maintains insertion order:");
        System.out.print("Order: ");
        for(int key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }
    
    // LRU Cache implementation
    static class LRUCache {
        LinkedHashMap<String, String> map;
        int capacity;
        
        LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new LinkedHashMap<String, String>(capacity, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return size() > capacity;
                }
            };
        }
        
        String get(String key) {
            return map.getOrDefault(key, null);
        }
        
        void put(String key, String value) {
            map.put(key, value);
        }
    }
}
