// Last updated: 30/09/2026, 10:21:33
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = n % 2;
4        n = n / 2;
5        while (n > 0) {
6            int curr = n % 2;
7            if (curr == prev) {
8                return false;
9            }
10            prev = curr;
11            n = n / 2;
12        }
13        return true;
14    }
15}