// Solution for Day 4  
// Day 4 - Minimum Cost Walk in Weighted Graph  

import java.util.*;

class Solution {
    public int[] minCostWalk(int n, int[][] edges, int[][] queries) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        // Build adjacency list
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
            graph.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }

        int[] result = new int[queries.length];

        // Precompute connected components
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int[] edge : edges) {
            int u = find(parent, edge[0]);
            int v = find(parent, edge[1]);
            if (u != v) parent[u] = v;
        }

        // Process queries
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            if (find(parent, u) != find(parent, v)) {
                result[i] = -1;  // No path exists
            } else {
                result[i] = bfs(graph, u, v);
            }
        }

        return result;
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }

    private int bfs(Map<Integer, List<int[]>> graph, int start, int end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, Integer.MAX_VALUE});
        Set<Integer> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int curr = node[0], andCost = node[1];

            if (curr == end) return andCost;

            if (!graph.containsKey(curr) || visited.contains(curr)) continue;
            visited.add(curr);

            for (int[] neighbor : graph.get(curr)) {
                int nextNode = neighbor[0], weight = neighbor[1];
                queue.offer(new int[]{nextNode, andCost & weight});
            }
        }

        return -1;  // No valid path
    }
}
