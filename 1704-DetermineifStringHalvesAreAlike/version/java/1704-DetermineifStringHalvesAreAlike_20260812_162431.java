// Last updated: 12/08/2026, 16:24:31
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int count = 0;
4        int half = s.length() / 2;
5
6        for (int i = 0; i < half; i++) {
7            if (isVowel(s.charAt(i))) {
8                count++;
9            }
10        }
11
12        for (int i = half; i < s.length(); i++) {
13            if (isVowel(s.charAt(i))) {
14                count--;
15            }
16        }
17
18        return count == 0;
19    }
20
21    private boolean isVowel(char c) {
22        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
23               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
24    }
25}