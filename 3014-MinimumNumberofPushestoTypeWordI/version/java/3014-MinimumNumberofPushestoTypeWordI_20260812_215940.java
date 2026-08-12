// Last updated: 12/08/2026, 21:59:40
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int pushes = 0;
5
6        for (int i = 0; i < n; i++) {
7            pushes += (i / 8) + 1;
8        }
9
10        return pushes;
11    }
12}