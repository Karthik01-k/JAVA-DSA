Java Practice - LeetCode Problems & Fundamentals

This repository contains Java practice problems organized by topics, with references to actual LeetCode problems.

🎯 Pattern Recognition Guide

🔍 How to Identify Patterns:

1. Two Pointers Pattern  
When to use: Array/string problems requiring comparison from both ends  
Keywords: "reverse", "palindrome", "sorted array", "pair sum"  
Examples: Reverse String, Valid Palindrome, Two Sum II  
Template: left = 0, right = n-1; while(left < right)

2. Hash Map Pattern  
When to use: Need fast lookup, counting, or complement finding  
Keywords: "frequency", "count", "find pair", "anagram"  
Examples: Two Sum, Group Anagrams, Frequency Map  
Template: Map<Key, Value> map = new HashMap<>();

3. Stack Pattern  
When to use: Nested structures, LIFO operations, matching pairs  
Keywords: "parentheses", "brackets", "nested", "valid"  
Examples: Valid Parentheses, Next Greater Element  
Template: Stack<Type> stack = new Stack<>();

4. Binary Search Pattern  
When to use: Sorted array, search space can be divided  
Keywords: "sorted", "search", "find target", "log n"  
Examples: Binary Search, Search Insert Position  
Template: left = 0, right = n-1; mid = left + (right-left)/2

5. Dynamic Programming Pattern  
When to use: Optimal substructure, overlapping subproblems  
Keywords: "maximum", "minimum", "count ways", "optimal"  
Examples: Maximum Subarray, Climbing Stairs  
Template: dp[i] = optimal(dp[i-1], current_choice)

6. Sliding Window Pattern  
When to use: Contiguous subarray/substring problems  
Keywords: "subarray", "substring", "window", "k elements"  
Examples: Longest Substring, Maximum Average  
Template: left = 0; for(right...) { while(condition) left++ }

7. Three Pointers Pattern  
When to use: Partitioning array into sections  
Keywords: "sort colors", "partition", "three sections"  
Examples: Sort Colors, Dutch National Flag  
Template: low = 0, mid = 0, high = n-1

🚀 Pattern Recognition Steps:
Read the problem - understand what's being asked  
Identify constraints - array size, time limits, space limits  
Look for keywords - sorted, pairs, frequency, nested, etc.  
Consider data structures - what would help solve this efficiently?  
Think about time complexity - can we do better than brute force?

Folder Structure

📁 Basics/
EvenOdd.java - Check if number is even/odd (Related: LC 1342)  
PositiveNegativeZero.java - Number sign checking (Related: LC 1822)  
LargestOf2.java - Find maximum of two numbers (Related: LC 104)  
LargestOf3.java - Find maximum of three numbers (Related: LC 414)  
LargestOf4.java - Find maximum of four numbers (Related: LC 215)  
LeapYear.java - Check leap year (Related: LC 1185)  
VowelConsonant.java - Character classification (Related: LC 345)  
CharacterType.java - Identify character type (Related: LC 125)  
CaseConversion.java - Convert case (Related: LC 709)  
DivisibleBy3And5.java - Divisibility check (Related: LC 412)  

📁 Loops/
Print1ToN.java - Print numbers 1 to N (Related: LC 1342)  
Factorial.java - Calculate factorial (Related: LC 172)  
ReverseNumber.java - Reverse integer (LC 7)  
PalindromeNumber.java - Check palindrome number (LC 9)  
FibonacciSeries.java - Generate Fibonacci series (Related: LC 509)  
FizzBuzz.java - Classic FizzBuzz problem (LC 412)  

📁 Arrays_Strings_Search/
TwoSum.java - Two Sum problem (LC 1) - Hash Map Pattern  
ValidParentheses.java - Valid parentheses (LC 20) - Stack Pattern  
BinarySearch.java - Binary search implementation (LC 704) - Binary Search Pattern  
ReverseString.java - Reverse string (LC 344) - Two Pointers Pattern  
KadaneAlgorithm.java - Maximum subarray (LC 53) - Dynamic Programming Pattern  

📁 Sorting/
MergeSort.java - Merge sort implementation (Related: LC 88)  
QuickSort.java - Quick sort implementation (Related: LC 215)  
SortColors.java - Dutch flag algorithm (LC 75) - Three Pointers Pattern  

📁 OOP/
Student.java - Basic class design (Related: LC 355)  
SingletonClass.java - Singleton pattern (Related: LC 146)  

📁 Collections/
ArrayListBasic.java - ArrayList operations (Related: LC 380)  
FrequencyMap.java - HashMap frequency counting (Related: LC 347) - Hash Map Pattern  

How to Use
Each file contains minimal working code  
Comments include LeetCode problem references  
Pattern recognition section helps identify similar problems  
Practice by implementing similar problems  
Extend solutions for edge cases  

LeetCode Problem Categories
Easy: Basic operations, simple algorithms  
Medium: Two pointers, sliding window, sorting  
Hard: Advanced algorithms, optimization  

Start with Basics folder and progress through each topic systematically.
