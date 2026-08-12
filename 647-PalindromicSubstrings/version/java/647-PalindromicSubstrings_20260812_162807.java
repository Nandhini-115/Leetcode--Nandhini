// Last updated: 12/08/2026, 16:28:07
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            count += expand(s, i, i);       // Odd length
7            count += expand(s, i, i + 1);   // Even length
8        }
9
10        return count;
11    }
12
13    private int expand(String s, int left, int right) {
14        int count = 0;
15
16        while (left >= 0 && right < s.length()
17                && s.charAt(left) == s.charAt(right)) {
18            count++;
19            left--;
20            right++;
21        }
22
23        return count;
24    }
25}