// Last updated: 28/08/2026, 09:35:34
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        java.util.Arrays.sort(g);
4        java.util.Arrays.sort(s);
5
6        int child = 0;
7        int cookie = 0;
8
9        while (child < g.length && cookie < s.length) {
10            if (s[cookie] >= g[child]) {
11                child++;
12            }
13
14            cookie++;
15        }
16
17        return child;
18    }
19}