# Problem Statement - Day 4

## Problem: 3108. Minimum Cost Walk in Weighted Graph  
[LeetCode Link](https://leetcode.com/problems/minimum-cost-walk-in-weighted-graph)  

### Problem Description  
There is an **undirected weighted graph** with `n` vertices labeled from `0` to `n - 1`.  

You are given an integer `n` and an array `edges`, where each edge is represented as:  
`edges[i] = [ui, vi, wi]` → an edge between **vertex `ui` and `vi`** with **weight `wi`**.  

A **walk** on a graph is a sequence of vertices and edges, where a vertex may be **revisited** multiple times.  

✅ The **cost** of a walk from `u` to `v` is defined as the **bitwise AND** (`&`) of all edge weights encountered in the walk.  

You are given a list of **queries** `query[i] = [si, ti]`, where for each query, you need to **find the minimum cost** of a walk from `si` to `ti`. If no such walk exists, return `-1`.  

---

### **Example 1:**  
**Input:**  
n = 5
edges = [[0,1,7],[1,3,7],[1,2,1]]
query = [[0,3],[3,4]]
**Output:**
[1, -1]
**Explanation:**  
1️⃣ The minimum cost from `0` to `3` is `1` using the path:  
0 → 1 (7), 1 → 2 (1), 2 → 1 (1), 1 → 3 (7) Cost = 7 & 1 & 1 & 7 = 1
2️⃣ No path exists from `3` to `4`, so the answer is `-1`.

---

### **Example 2:**  
**Input:**  
n = 3
edges = [[0,2,7],[0,1,15],[1,2,6],[1,2,1]]
query = [[1,2]]
**Output:**  
[0]
**Explanation:**  
✅ To get cost `0`, we use the path:  
1 → 2 (1), 2 → 1 (6), 1 → 2 (1) Cost = 1 & 6 & 1 = 0

---

### **Constraints:**  
- `2 <= n <= 10^5`  
- `0 <= edges.length <= 10^5`  
- `edges[i] = [ui, vi, wi]`, where `0 <= wi <= 10^5`  
- `1 <= query.length <= 10^5`  
- `0 <= si, ti <= n - 1`, where `si ≠ ti`  

---


























