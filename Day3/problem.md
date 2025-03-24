# Problem Statement - Day 3  

## Problem: 3191. Minimum Operations to Make Binary Array Elements Equal to One  
[LeetCode Link](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one)  

### Problem Description  
You are given a **binary array** `nums`.  

You can perform the following operation on the array any number of times (possibly zero):  
- Choose any **three consecutive elements** from the array and **flip all of them**.  
- Flipping an element means changing its value from `0` to `1`, and from `1` to `0`.  

Return the **minimum number of operations** required to make all elements in `nums` equal to `1`.  
If it is **impossible**, return `-1`.  

### Example 1:  
**Input:**  
nums = [0,1,1,1,0,0]
**Output:**  
3
**Explanation:**  
We can perform the following operations:  
1. Flip elements at indices `(0,1,2)` → `nums = [1,0,0,1,0,0]`  
2. Flip elements at indices `(1,2,3)` → `nums = [1,1,1,0,0,0]`  
3. Flip elements at indices `(3,4,5)` → `nums = [1,1,1,1,1,1]`  

### Example 2:  
**Input:**  
nums = [0,1,1,1]
**Output:**  
-1
**Explanation:**  
It is impossible to make all elements equal to `1`.  

### Constraints:  
- `3 <= nums.length <= 10^5`  
- `0 <= nums[i] <= 1`  
