# Binary Search Notes

## Definiton

**Binary Search** is a searching algorithm used in a sorted array by repeatedly diving the search interval in half. The idea of **binary search** is to use the inromation that the array is sorted and reduce the time complexity to O(log n)

## Implementation

The basic steps to perform **binary search** are:

- Begin with the mid element of the whole array as the search key
- If the value of the search key is equal to the item then return index of the search key
- If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half
- Otherwise, narrow the interval to the upper half
- Repeatedly check from the second point until the value is found or the interval is empty

## Complexity

O(log n)

## Uses

- To find if n is a square of an intger
- Find the first value greater than or equal to x in a given array of sorted integers
- Find the frequency of a given target value in an array of integers
- Find the peak of an array which increases then decreases
- A sorted array is rotated n time, search for a target value in the array

Real World Applications

- Dictionary
: A dictionary contains thousands of words. It's time consuming to go through and check for each word if we want to search "Voracious". We go to the middle page and compare the words on that page with "Voracious". If "Voracious" is alphabetically smaller than the word on the middle page, then we can ignore all pages on the right side. If it is alphabetically larger than the word on the middle page then we ignore all pages on the left side. We keep repeating this process until we find the word.
- Debugging a linear piece of code
: If a code has many steps mostly executed in a sequence and there's a bug, we can isolate the bug by finding the earliest step where the code produces results which are different from the expected ones.
- Figuring out resource requirements for a large system
: Try running load tests on the sytem and **binary search** for the minimum amount of CPUs requires to handle a predicted load
- Any sorted collection from any language library such as Java, .NET, C++, etc. use **binary search** to find values
- Semiconductor test programs used for measuring digital timing or analog levels
- Used to find the numerical solution to an equation

### Sources

[Binary Search Notes](https://www.geeksforgeeks.org/binary-search/)