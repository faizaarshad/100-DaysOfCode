"# Problem Statement - Day 1" 
# 🚀 Day 1 - Divide Array Into Equal Pairs  

🔗 **LeetCode Link:** [2206. Divide Array Into Equal Pairs](https://leetcode.com/problems/divide-array-into-equal-pairs/)  

## 📝 Problem Statement  
You are given an **integer array** `nums` consisting of `2 * n` integers.  

You need to divide `nums` into `n` pairs such that:  
- Each element belongs to **exactly one pair**.  
- The elements present in a pair are **equal**.  

Return `true` *if it is possible to divide `nums` into `n` pairs*, otherwise return `false`.  

## 🧩 **Examples**  

### **Example 1**  
Input: nums = [3,2,3,2,2,2]
Output: true
Explanation:
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2,2), (3,3), and (2,2), it will satisfy all the conditions.


### **Example 2**  
nput: nums = [1,2,3,4]
Output: false
Explanation:
There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.


---

## 🔢 **Constraints**  
- `nums.length == 2 * n`  
- `1 <= n <= 500`  
- `1 <= nums[i] <= 500`  

---

