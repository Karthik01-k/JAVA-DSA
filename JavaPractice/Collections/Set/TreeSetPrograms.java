// TreeSet Programs - Sorted Set Implementation
package Collections.Set;

import java.util.*;

public class TreeSetPrograms {
    public static void main(String[] args) {
        System.out.println("===== TREESET PROGRAMS =====\n");
        
        sortedOrder();
        navigationMethods();
        rangeQueries();
        descendingOrder();
        customComparator();
    }
    
    public static void sortedOrder() {
        System.out.println("\n--- SORTED ORDER ---");
        TreeSet<Integer> set = new TreeSet<>();
        
        System.out.println("Adding: 50, 10, 30, 20, 40");
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        
        System.out.println("TreeSet (sorted): " + set);
        System.out.println("Time: O(log n) for operations");
    }
    
    public static void navigationMethods() {
        System.out.println("\n--- NAVIGATION METHODS ---");
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        
        System.out.println("TreeSet: " + set);
        
        System.out.println("\nfirst(): " + set.first());
        System.out.println("last(): " + set.last());
        
        System.out.println("\nfloor(25): " + set.floor(25));        // <= 25
        System.out.println("ceiling(25): " + set.ceiling(25));      // >= 25
        
        System.out.println("\nlower(30): " + set.lower(30));        // < 30
        System.out.println("higher(30): " + set.higher(30));        // > 30
    }
    
    public static void rangeQueries() {
        System.out.println("\n--- RANGE QUERIES ---");
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        
        System.out.println("TreeSet: " + set);
        
        System.out.println("\nheadSet(40): " + set.headSet(40));           // < 40
        System.out.println("tailSet(40): " + set.tailSet(40));            // >= 40
        System.out.println("subSet(30, 60): " + set.subSet(30, 60));      // [30, 60)
        
        System.out.println("\nheadSet(40, true): " + set.headSet(40, true)); // <= 40
        System.out.println("subSet(30, true, 60, true): " + 
                          set.subSet(30, true, 60, true));                // [30, 60]
    }
    
    public static void descendingOrder() {
        System.out.println("\n--- DESCENDING ORDER ---");
        TreeSet<String> set = new TreeSet<>(Arrays.asList("Zebra", "Apple", "Monkey", "Banana"));
        
        System.out.println("Ascending: " + set);
        System.out.println("Descending: " + set.descendingSet());
        
        System.out.println("\nDescending Iterator:");
        Iterator<String> iter = set.descendingIterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
    
    public static void customComparator() {
        System.out.println("\n--- CUSTOM COMPARATOR ---");
        
        System.out.println("\n1. Reverse Order");
        TreeSet<Integer> reverse = new TreeSet<>(Comparator.reverseOrder());
        reverse.addAll(Arrays.asList(5, 2, 8, 1, 9, 3));
        System.out.println("Numbers (reverse): " + reverse);
        
        System.out.println("\n2. Case-Insensitive");
        TreeSet<String> caseInsensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        caseInsensitive.addAll(Arrays.asList("Apple", "banana", "Cherry", "apple"));
        System.out.println("Words (case-insensitive): " + caseInsensitive);
        
        System.out.println("\n3. By String Length");
        TreeSet<String> byLength = new TreeSet<>(Comparator.comparingInt(String::length));
        byLength.addAll(Arrays.asList("I", "am", "learning", "Java"));
        System.out.println("Words (by length): " + byLength);
        
        System.out.println("\n4. Custom Objects");
        TreeSet<Student> students = new TreeSet<>(Comparator.comparingDouble(Student::getGPA).reversed());
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.9));
        System.out.println("Students (by GPA desc):");
        for(Student s : students) {
            System.out.println("  " + s.getName() + ": " + s.getGPA());
        }
    }
    
    static class Student implements Comparable<Student> {
        String name;
        double gpa;
        
        Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }
        
        String getName() { return name; }
        double getGPA() { return gpa; }
        
        public int compareTo(Student other) {
            return Double.compare(this.gpa, other.gpa);
        }
    }
}
