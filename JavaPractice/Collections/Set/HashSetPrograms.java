// HashSet Programs - Hash Table Set Implementation
package Collections.Set;

import java.util.*;

public class HashSetPrograms {
    public static void main(String[] args) {
        System.out.println("===== HASHSET PROGRAMS =====\n");
        
        basicOperations();
        noDuplicates();
        uniqueCharacters();
        setOperations();
        anagramGrouping();
        performance();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");
        HashSet<Integer> set = new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 99: " + set.contains(99));
    }
    
    public static void noDuplicates() {
        System.out.println("\n--- NO DUPLICATES ---");
        HashSet<Integer> set = new HashSet<>();
        
        System.out.println("Adding: 5, 10, 5, 15, 10, 20");
        set.add(5);
        set.add(10);
        set.add(5);   // Duplicate
        set.add(15);
        set.add(10);  // Duplicate
        set.add(20);
        
        System.out.println("HashSet (unique): " + set);
        System.out.println("Size: " + set.size());
    }
    
    public static void uniqueCharacters() {
        System.out.println("\n--- UNIQUE CHARACTERS ---");
        String str = "programming";
        HashSet<Character> chars = new HashSet<>();
        
        for(char c : str.toCharArray()) {
            chars.add(c);
        }
        
        System.out.println("String: " + str);
        System.out.println("Unique characters: " + chars);
        System.out.println("Count: " + chars.size());
    }
    
    public static void setOperations() {
        System.out.println("\n--- SET OPERATIONS ---");
        
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        
        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nUnion: " + union);
        
        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }
    
    public static void anagramGrouping() {
        System.out.println("\n--- FIND COMMON LETTERS (Intersection) ---");
        String word1 = "listen";
        String word2 = "silent";
        
        HashSet<Character> letters1 = new HashSet<>();
        HashSet<Character> letters2 = new HashSet<>();
        
        for(char c : word1.toCharArray()) letters1.add(c);
        for(char c : word2.toCharArray()) letters2.add(c);
        
        System.out.println("Word1: " + word1 + " -> " + letters1);
        System.out.println("Word2: " + word2 + " -> " + letters2);
        
        letters1.retainAll(letters2);
        System.out.println("Common letters: " + letters1);
    }
    
    public static void performance() {
        System.out.println("\n--- PERFORMANCE ---");
        System.out.println("HashSet Time Complexity:");
        System.out.println("- add():     O(1) average");
        System.out.println("- remove():  O(1) average");
        System.out.println("- contains(): O(1) average");
        System.out.println("- size():    O(1)");
        System.out.println("\nWorst case: O(n) when hash collisions occur");
        System.out.println("\nMemory: More than array, but faster lookups");
    }
}
