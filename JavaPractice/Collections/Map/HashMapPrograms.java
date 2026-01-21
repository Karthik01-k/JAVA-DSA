// HashMap Programs - Hash Table Map Implementation
package Collections.Map;

import java.util.*;

public class HashMapPrograms {
    public static void main(String[] args) {
        System.out.println("===== HASHMAP PROGRAMS =====\n");
        
        basicOperations();
        wordFrequency();
        groupByProperty();
        characterFrequency();
        twoSumOptimized();
        cacheImplementation();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        
        System.out.println("HashMap: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Get 'Banana': " + map.get("Banana"));
        System.out.println("Get 'Grape' (default 0): " + map.getOrDefault("Grape", 0));
        
        map.put("Apple", 15);
        System.out.println("After update: " + map);
        
        map.remove("Banana");
        System.out.println("After remove: " + map);
    }
    
    public static void wordFrequency() {
        System.out.println("\n--- WORD FREQUENCY ---");
        String text = "hello world hello java world java programming java";
        HashMap<String, Integer> frequency = new HashMap<>();
        
        for(String word : text.split(" ")) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Text: " + text);
        System.out.println("\nFrequency Map:");
        for(Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        
        // Find most frequent
        String mostFrequent = frequency.entrySet().stream()
            .max(Comparator.comparingInt(Map.Entry::getValue))
            .map(Map.Entry::getKey)
            .orElse("");
        System.out.println("Most frequent: " + mostFrequent);
    }
    
    public static void groupByProperty() {
        System.out.println("\n--- GROUP BY PROPERTY ---");
        List<Student> students = Arrays.asList(
            new Student("Alice", "A", 90),
            new Student("Bob", "B", 80),
            new Student("Charlie", "A", 85),
            new Student("David", "B", 88)
        );
        
        HashMap<String, List<Student>> byGrade = new HashMap<>();
        for(Student s : students) {
            byGrade.computeIfAbsent(s.grade, k -> new ArrayList<>()).add(s);
        }
        
        System.out.println("Students grouped by grade:");
        for(Map.Entry<String, List<Student>> entry : byGrade.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + 
                entry.getValue().stream().map(s -> s.name).toList());
        }
    }
    
    public static void characterFrequency() {
        System.out.println("\n--- CHARACTER FREQUENCY ---");
        String str = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("String: " + str);
        System.out.println("Character frequency:");
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("  '" + entry.getKey() + "': " + entry.getValue());
        }
    }
    
    public static void twoSumOptimized() {
        System.out.println("\n--- TWO SUM (Optimized) ---");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        System.out.println("Numbers: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
    }
    
    public static void cacheImplementation() {
        System.out.println("\n--- SIMPLE CACHE ---");
        HashMap<Integer, String> cache = new HashMap<>();
        
        cache.put(1, "User1");
        cache.put(2, "User2");
        cache.put(3, "User3");
        
        System.out.println("Cache: " + cache);
        
        // Lookup with default
        String user = cache.getOrDefault(2, "Not found");
        System.out.println("Get key 2: " + user);
        
        user = cache.getOrDefault(99, "Not found");
        System.out.println("Get key 99: " + user);
        
        // putIfAbsent
        cache.putIfAbsent(4, "User4");
        cache.putIfAbsent(1, "UpdatedUser1"); // Won't update
        System.out.println("After putIfAbsent: " + cache);
    }
    
    static class Student {
        String name, grade;
        int score;
        
        Student(String name, String grade, int score) {
            this.name = name;
            this.grade = grade;
            this.score = score;
        }
    }
}
