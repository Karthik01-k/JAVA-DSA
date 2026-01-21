// Design Pattern: Singleton
// Similar to LeetCode design problems
// Related: LeetCode 146 - LRU Cache
// https://leetcode.com/problems/lru-cache/
//
// APPROACH (Singleton Pattern):
// 1. Make constructor private to prevent direct instantiation
// 2. Create static instance variable to hold single instance
// 3. Provide public static method getInstance() for access
// 4. Check if instance is null, create if needed (lazy initialization)
// 5. Return same instance for all calls
// 6. Thread-safety can be added with synchronized keyword

public class SingletonClass {
    private static SingletonClass instance;
    private int data;
    
    private SingletonClass() {
        data = 100;
    }
    
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
    
    public int getData() { return data; }
    public void setData(int data) { this.data = data; }
    
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println("Same instance: " + (s1 == s2));
    }
}