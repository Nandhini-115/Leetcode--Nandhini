// Last updated: 07/10/2026, 09:49:50
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() < 2) {
4            return s;
5        }
6        String result = "";
7        for (int i = 0; i < s.length(); i++) {
8            String odd = expand(s, i, i);
9            String even = expand(s, i, i + 1);
10            if (odd.length() > result.length()) {
11                result = odd;
12            }
13            if (even.length() > result.length()) {
14                result = even;
15            }
16        }
17        return result;
18    }
19
20    public String expand(String s, int left, int right) {
21
22        while (left >= 0 && right < s.length()
23                && s.charAt(left) == s.charAt(right)) {
24
25            left--;
26            right++;
27        }
28
29        return s.substring(left + 1, right);
30    }
31}