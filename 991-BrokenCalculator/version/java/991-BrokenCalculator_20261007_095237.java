// Last updated: 07/10/2026, 09:52:37
1class Solution {
2    public int brokenCalc(int startValue, int target) {
3        int count = 0;
4        while (target > startValue) {
5            if (target % 2 == 0) {
6                target = target / 2;
7            } else {
8                target = target + 1;
9            }
10            count++;
11        }
12        return count + (startValue - target);
13    }
14}