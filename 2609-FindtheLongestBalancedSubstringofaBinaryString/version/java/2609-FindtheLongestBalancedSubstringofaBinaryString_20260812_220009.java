// Last updated: 12/08/2026, 22:00:09
1class Solution {
2    public int findTheLongestBalancedSubstring(String s) {
3        int max = 0;
4        int zeros = 0;
5        int ones = 0;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '0') {
8                zeros++;
9            } else {
10                ones++;
11                max = Math.max(max, 2 * Math.min(zeros, ones));
12                if (i + 1 < s.length() && s.charAt(i + 1) == '0') {
13                    zeros = 0;
14                    ones = 0;
15                }
16            }
17        }
18
19        return max;
20    }
21}