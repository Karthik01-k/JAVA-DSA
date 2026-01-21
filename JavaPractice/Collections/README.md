# Java Collections Framework - Complete Guide

## Overview
This folder contains a comprehensive guide to Java's Collections Framework with interfaces, implementations, and practical examples.

## Folder Structure

```
Collections/
├── Interfaces/
│   ├── ListInterface.java       - List methods & implementations
│   ├── SetInterface.java        - Set methods & implementations
│   ├── MapInterface.java        - Map methods & implementations
│   ├── QueueInterface.java      - Queue methods & implementations
│   └── StackInterface.java      - Stack methods & applications
├── List/
│   └── ListImplementations.java - ArrayList, LinkedList, Vector programs
├── Set/
│   └── SetImplementations.java  - HashSet, LinkedHashSet, TreeSet programs
├── Map/
│   └── MapImplementations.java  - HashMap, LinkedHashMap, TreeMap programs
├── Queue/
│   └── QueueImplementations.java - Queue, PriorityQueue, Deque programs
├── Stack/
│   └── StackImplementations.java - Stack operations and applications
└── ArrayListBasic.java          - All ArrayList built-in methods (35 methods)
```

---

## 1. LIST INTERFACE

### Purpose
Ordered collection that allows duplicates. Maintains insertion order (except certain implementations).

### Methods
- `add(E element)` - Add at end: O(1)
- `add(int index, E element)` - Add at index: O(n)
- `get(int index)` - Get element: O(1)
- `set(int index, E element)` - Replace: O(1)
- `remove(int index)` - Remove at index: O(n)
- `indexOf(Object o)` - First occurrence: O(n)
- `subList(int from, int to)` - Get sublist view: O(1)

### Implementations

| Type | Backed By | Access | Insert/Delete | Order | Best For |
|------|-----------|--------|---------------|-------|----------|
| **ArrayList** | Dynamic Array | O(1) | O(n) | Insertion | Random access, few changes |
| **LinkedList** | Doubly Linked List | O(n) | O(1) at ends | Insertion | Frequent insertions/deletions |
| **Vector** | Dynamic Array | O(1) | O(n) | Insertion | Legacy (avoid) |

---

## 2. SET INTERFACE

### Purpose
Unordered collection with NO duplicates.

### Methods
- `add(E element)` - Add element: O(1)
- `remove(Object o)` - Remove: O(1)
- `contains(Object o)` - Check: O(1)
- `size()` - Get size: O(1)
- `retainAll(Collection c)` - Intersection: O(n)
- `removeAll(Collection c)` - Difference: O(n)

### Implementations

| Type | Backed By | Time | Order | Best For |
|------|-----------|------|-------|----------|
| **HashSet** | Hash Table | O(1) | Random | Fast lookup, no order |
| **LinkedHashSet** | Hash Table + LinkedList | O(1) | Insertion | Insertion order needed |
| **TreeSet** | Red-Black Tree | O(log n) | Sorted | Sorted unique elements |

---

## 3. MAP INTERFACE

### Purpose
Key-value pairs with no duplicate keys.

### Methods
- `put(K key, V value)` - Insert/Update: O(1)
- `get(Object key)` - Get value: O(1)
- `remove(Object key)` - Remove: O(1)
- `keySet()` - Get all keys: O(1)
- `values()` - Get all values: O(1)
- `entrySet()` - Get key-value pairs: O(1)
- `containsKey(Object key)` - Check key: O(1)
- `containsValue(Object value)` - Check value: O(n)

### Implementations

| Type | Backed By | Time | Order | Best For |
|------|-----------|------|-------|----------|
| **HashMap** | Hash Table | O(1) | Random | Fast key-value lookup |
| **LinkedHashMap** | Hash Table + LinkedList | O(1) | Insertion | Insertion order, LRU cache |
| **TreeMap** | Red-Black Tree | O(log n) | Sorted by key | Sorted key-value pairs |

---

## 4. QUEUE INTERFACE

### Purpose
FIFO (First In First Out) collection for ordering elements.

### Methods
- `add(E element)` / `offer(E element)` - Add at rear: O(1)
- `remove()` / `poll()` - Remove from front: O(1)
- `element()` / `peek()` - View front: O(1)

| Exception Method | Return Null |
|-----------------|-------------|
| `add()` | `offer()` |
| `remove()` | `poll()` |
| `element()` | `peek()` |

### Implementations

| Type | Structure | Time | Use Case |
|------|-----------|------|----------|
| **LinkedList Queue** | Doubly Linked List | O(1) | BFS, task queue |
| **PriorityQueue** | Min Heap | O(log n) add/poll | Task scheduling, Dijkstra |
| **ArrayDeque** | Resizable Array | O(1) both ends | Stack & Queue hybrid |

---

## 5. STACK INTERFACE

### Purpose
LIFO (Last In First Out) collection.

### Methods
- `push(E item)` - Add to top: O(1)
- `pop()` - Remove from top: O(1)
- `peek()` - View top: O(1)
- `empty()` - Check if empty: O(1)
- `search(Object o)` - Find element: O(n)

### Recommended Implementation
**Use `Deque<Integer> stack = new ArrayDeque<>();` instead of Stack class**

### Common Applications
1. **Balanced Parentheses** - Check if brackets are matched
2. **Undo/Redo** - Store history of actions
3. **Expression Conversion** - Infix to Postfix
4. **Tower of Hanoi** - Recursive problem solving
5. **DFS** - Depth-First Search
6. **Browser History** - Back button functionality

---

## 6. COMPLETE METHOD SUMMARY

### ArrayList (35 Methods)
See `ArrayListBasic.java` for all methods including:
- Core: add, remove, get, set, clear, contains
- Iteration: iterator, forEach, stream
- Array conversion: toArray
- Sorting: sort, Collections.sort, Collections.reverse
- Search: indexOf, Collections.binarySearch
- Analysis: size, isEmpty, contains

### Collections Utility Methods
```java
Collections.sort(list);              // Sort O(n log n)
Collections.reverse(list);           // Reverse O(n)
Collections.shuffle(list);           // Shuffle O(n)
Collections.binarySearch(list, key); // Search O(log n)
Collections.min(list);               // Find minimum
Collections.max(list);               // Find maximum
Collections.frequency(list, obj);    // Count occurrences
```

---

## 7. TIME COMPLEXITY COMPARISON

### Access Operation
```
ArrayList:      O(1)
LinkedList:     O(n)
HashSet:        O(1)
TreeSet:        O(log n)
HashMap:        O(1)
TreeMap:        O(log n)
```

### Insert/Delete
```
ArrayList:      O(n)
LinkedList:     O(1) at ends, O(n) middle
HashSet:        O(1)
TreeSet:        O(log n)
HashMap:        O(1)
TreeMap:        O(log n)
```

---

## 8. WHEN TO USE

### Choose ArrayList When:
- You need frequent access by index
- You have few insertions/deletions
- Memory efficiency is important

### Choose LinkedList When:
- You frequently insert/delete at ends
- You need Queue or Deque behavior
- You don't need random access

### Choose HashSet When:
- You need unique elements
- You don't care about order
- You need O(1) operations

### Choose TreeSet When:
- You need sorted unique elements
- You need range queries (subSet, headSet)
- Order matters

### Choose HashMap When:
- You need fast key-value lookup
- Order doesn't matter
- You have many lookups

### Choose TreeMap When:
- You need sorted key-value pairs
- You need range queries
- You need NavigableMap operations

### Choose PriorityQueue When:
- Elements have different priorities
- You need task scheduling
- You're implementing Dijkstra/A* algorithms

### Choose Stack When:
- You need LIFO behavior
- Use ArrayDeque instead for better performance

---

## 9. RUNNING THE PROGRAMS

### Compile all files
```bash
javac Collections/Interfaces/*.java
javac Collections/List/*.java
javac Collections/Set/*.java
javac Collections/Map/*.java
javac Collections/Queue/*.java
javac Collections/Stack/*.java
javac Collections/ArrayListBasic.java
```

### Run specific files
```bash
java Collections.Interfaces.ListInterface
java Collections.Interfaces.SetInterface
java Collections.Interfaces.MapInterface
java Collections.Interfaces.QueueInterface
java Collections.Interfaces.StackInterface
java Collections.List.ListImplementations
java Collections.Set.SetImplementations
java Collections.Map.MapImplementations
java Collections.Queue.QueueImplementations
java Collections.Stack.StackImplementations
java Collections.ArrayListBasic
```

---

## 10. KEY TAKEAWAYS

1. **Know your data structure** - Pick the right collection for the job
2. **Understand time complexity** - Different operations have different costs
3. **Use modern implementations** - Prefer ArrayList over Vector, ArrayDeque over Stack
4. **Know the interfaces** - List, Set, Map, Queue are the main types
5. **Collections utility methods** - sort, reverse, shuffle, search, min, max, frequency
6. **Generic types** - Always use generics for type safety
7. **Null handling** - Most collections allow nulls except TreeSet/TreeMap
8. **Synchronization** - Collections are not thread-safe except Vector/Hashtable
9. **Iteration** - Use forEach, iterator, or stream for safe iteration
10. **LRU Cache** - LinkedHashMap can implement LRU cache efficiently

---

## 11. COMMON PATTERNS

### Remove while iterating
```java
Iterator<String> it = list.iterator();
while(it.hasNext()) {
    if(condition) it.remove();
    else it.next();
}
```

### LRU Cache with LinkedHashMap
```java
LinkedHashMap<K, V> cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
};
```

### Custom Sorting
```java
list.sort(Comparator.comparingInt(Object::getField).reversed());
```

### Frequency Counter
```java
HashMap<T, Integer> freq = new HashMap<>();
for(T item : list) {
    freq.put(item, freq.getOrDefault(item, 0) + 1);
}
```

---

## Reference
- **Java Collections Framework**: https://docs.oracle.com/javase/tutorial/collections/
- **Time Complexity**: https://bigocheatsheet.com
- **Design Patterns**: Common use cases documented in each implementation

Happy coding! 🚀
