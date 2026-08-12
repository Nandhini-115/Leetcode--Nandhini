// Last updated: 12/08/2026, 16:14:51
1class Solution {
2    public int maxChunksToSorted(int[] arr) {
3        int chunks = 0;
4        int max = 0;
5
6        for (int i = 0; i < arr.length; i++) {
7            max = Math.max(max, arr[i]);
8
9            if (max == i) {
10                chunks++;
11            }
12        }
13
14        return chunks;
15    }
16}