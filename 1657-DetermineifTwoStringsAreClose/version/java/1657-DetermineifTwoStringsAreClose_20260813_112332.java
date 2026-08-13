// Last updated: 13/08/2026, 11:23:32
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3
4        if (word1.length() != word2.length()) {
5            return false;
6        }
7
8        int[] freq1 = new int[26];
9        int[] freq2 = new int[26];
10
11        // Count characters
12        for (char c : word1.toCharArray()) {
13            freq1[c - 'a']++;
14        }
15
16        for (char c : word2.toCharArray()) {
17            freq2[c - 'a']++;
18        }
19
20        // Check both strings have the same characters
21        for (int i = 0; i < 26; i++) {
22            if ((freq1[i] == 0) != (freq2[i] == 0)) {
23                return false;
24            }
25        }
26
27        // Sort frequency arrays
28        java.util.Arrays.sort(freq1);
29        java.util.Arrays.sort(freq2);
30
31        // Check frequency distributions
32        return java.util.Arrays.equals(freq1, freq2);
33    }
34}