// Last updated: 11/09/2026, 10:25:08
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int n = x ^ y;
4        int count = 0;
5
6        while (n != 0) {
7            count += n & 1;
8            n = n >> 1;
9        }
10
11        return count;
12    }
13}