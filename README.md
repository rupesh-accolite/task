# Task given: Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

## Approach: 
Read the size of list, numbers in list and target value to search from console.
Call the "search()" function with list and target as arguments.
The approach used in this function is binary search with runtime complexity O(log n).
As the numbers are already in ascending order, no need to sort the list.
We compare the target value to search with the middle integer of the list.
If the middle element is the target, return the index of middle integer.
If the middle element is greater than target, then consider the left sublist of middle element by ignoring the right half and repeat the process.
If the middle element is less than target, then consider the right sublist of middle element by ignoring the left half and repeat the process.
If the whole list is traversed and nothing is returned, return -1 as the target is not present in list.
