// Last updated: 12/08/2026, 16:15:10
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] count = new int[26];
4
5        for (String word : words) {
6            for (char c : word.toCharArray()) {
7                count[c - 'a']++;
8            }
9        }
10
11        for (int i = 0; i < 26; i++) {
12            if (count[i] % words.length != 0) {
13                return false;
14            }
15        }
16
17        return true;
18    }
19}