// Collections Framework: ArrayList - All Built-in Methods
// ArrayList is a dynamic array that grows/shrinks automatically
// Time Complexity: O(1) add at end, O(n) insert/remove in middle, O(1) access

import java.util.*;

public class ArrayListBasic {
    public static void main(String[] args) {
        System.out.println("===== ARRAYLIST ALL BUILT-IN METHODS =====\n");
        
        // 1. add(E element) - Add element at end
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("1. add(element): " + list);
        
        // 2. add(int index, E element) - Add element at specific index
        list.add(1, 15);
        System.out.println("2. add(index, element) at index 1: " + list);
        
        // 3. addAll(Collection c) - Add all elements from another collection
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(40, 50, 60));
        list.addAll(list2);
        System.out.println("3. addAll(collection): " + list);
        
        // 4. addAll(int index, Collection c) - Add all at specific index
        list.addAll(3, Arrays.asList(35, 36));
        System.out.println("4. addAll(index, collection) at index 3: " + list);
        
        // 5. get(int index) - Get element at index
        int element = list.get(0);
        System.out.println("5. get(0): " + element);
        
        // 6. size() - Get number of elements
        System.out.println("6. size(): " + list.size());
        
        // 7. isEmpty() - Check if list is empty
        System.out.println("7. isEmpty(): " + list.isEmpty());
        
        // 8. contains(Object o) - Check if element exists
        System.out.println("8. contains(20): " + list.contains(20));
        System.out.println("8. contains(99): " + list.contains(99));
        
        // 9. indexOf(Object o) - Get first occurrence index
        System.out.println("9. indexOf(30): " + list.indexOf(30));
        
        // 10. lastIndexOf(Object o) - Get last occurrence index
        list.add(30); // Add duplicate
        System.out.println("10. lastIndexOf(30): " + list.lastIndexOf(30));
        
        // 11. remove(int index) - Remove element at index
        list.remove(0);
        System.out.println("11. remove(0): " + list);
        
        // 12. remove(Object o) - Remove first occurrence of element
        list.remove(Integer.valueOf(20));
        System.out.println("12. remove(Integer.valueOf(20)): " + list);
        
        // 13. removeAll(Collection c) - Remove all matching elements
        list.removeAll(Arrays.asList(40, 50));
        System.out.println("13. removeAll([40, 50]): " + list);
        
        // 14. retainAll(Collection c) - Keep only elements in collection
        ArrayList<Integer> list3 = new ArrayList<>(list);
        list3.retainAll(Arrays.asList(15, 30, 35));
        System.out.println("14. retainAll([15, 30, 35]): " + list3);
        
        // 15. set(int index, E element) - Replace element at index
        list.set(0, 100);
        System.out.println("15. set(0, 100): " + list);
        
        // 16. clear() - Remove all elements
        ArrayList<Integer> tempList = new ArrayList<>(list);
        tempList.clear();
        System.out.println("16. clear(): " + tempList);
        
        // 17. clone() - Create shallow copy
        ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone();
        System.out.println("17. clone(): " + clonedList);
        
        // 18. toArray() - Convert to array
        Object[] arr = list.toArray();
        System.out.println("18. toArray(): " + Arrays.toString(arr));
        
        // 19. toArray(T[] a) - Convert to typed array
        Integer[] intArr = list.toArray(new Integer[0]);
        System.out.println("19. toArray(Integer[]): " + Arrays.toString(intArr));
        
        // 20. iterator() - Get iterator
        Iterator<Integer> iter = list.iterator();
        System.out.print("20. iterator(): ");
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        
        // 21. listIterator() - Get bidirectional iterator
        ListIterator<Integer> listIter = list.listIterator();
        System.out.print("21. listIterator() forward: ");
        while(listIter.hasNext()) {
            System.out.print(listIter.next() + " ");
        }
        System.out.println();
        
        // 22. subList(int fromIndex, int toIndex) - Get sub-list (view)
        List<Integer> sublist = list.subList(1, 3);
        System.out.println("22. subList(1, 3): " + sublist);
        
        // 23. sort(Comparator c) - Sort using comparator
        ArrayList<Integer> unsorted = new ArrayList<>(Arrays.asList(50, 20, 80, 10, 30));
        unsorted.sort(Comparator.naturalOrder());
        System.out.println("23. sort(Comparator.naturalOrder()): " + unsorted);
        
        // 24. sort with reverse order
        unsorted.sort(Comparator.reverseOrder());
        System.out.println("24. sort(Comparator.reverseOrder()): " + unsorted);
        
        // 25. forEach() - Iterate using lambda
        System.out.print("25. forEach(Consumer): ");
        list.forEach(num -> System.out.print(num + " "));
        System.out.println();
        
        // 26. stream() - Convert to stream
        System.out.print("26. stream().filter(): ");
        list.stream().filter(n -> n > 30).forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // 27. ensureCapacity(int minCapacity) - Ensure minimum capacity
        ArrayList<Integer> capacityList = new ArrayList<>();
        capacityList.ensureCapacity(100);
        System.out.println("27. ensureCapacity(100): Capacity increased for efficiency");
        
        // 28. trimToSize() - Trim capacity to size
        ArrayList<Integer> trimList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        trimList.trimToSize();
        System.out.println("28. trimToSize(): Capacity trimmed to actual size");
        
        // 29. Collections.sort() - Sort using Collections utility
        ArrayList<Integer> sortList = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        Collections.sort(sortList);
        System.out.println("29. Collections.sort(): " + sortList);
        
        // 30. Collections.reverse() - Reverse using Collections utility
        Collections.reverse(sortList);
        System.out.println("30. Collections.reverse(): " + sortList);
        
        // 31. Collections.shuffle() - Shuffle using Collections utility
        ArrayList<Integer> shuffleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(shuffleList);
        System.out.println("31. Collections.shuffle(): " + shuffleList);
        
        // 32. Collections.binarySearch() - Search in sorted list
        ArrayList<Integer> searchList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int index = Collections.binarySearch(searchList, 5);
        System.out.println("32. Collections.binarySearch(5): " + index);
        
        // 33. Collections.min() - Find minimum
        System.out.println("33. Collections.min(): " + Collections.min(searchList));
        
        // 34. Collections.max() - Find maximum
        System.out.println("34. Collections.max(): " + Collections.max(searchList));
        
        // 35. Collections.frequency() - Count occurrences
        ArrayList<Integer> freqList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 2, 4));
        System.out.println("35. Collections.frequency(2): " + Collections.frequency(freqList, 2));
    }
}