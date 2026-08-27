// Last updated: 27/08/2026, 09:43:07
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        java.util.List<Integer>[] graph = new java.util.ArrayList[n];
4
5        for (int i = 0; i < n; i++) {
6            graph[i] = new java.util.ArrayList<>();
7        }
8
9        for (int[] edge : edges) {
10            graph[edge[0]].add(edge[1]);
11            graph[edge[1]].add(edge[0]);
12        }
13
14        boolean[] visited = new boolean[n];
15        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
16
17        queue.add(source);
18        visited[source] = true;
19
20        while (!queue.isEmpty()) {
21            int node = queue.poll();
22
23            if (node == destination) {
24                return true;
25            }
26
27            for (int next : graph[node]) {
28                if (!visited[next]) {
29                    visited[next] = true;
30                    queue.add(next);
31                }
32            }
33        }
34
35        return false;
36    }
37}