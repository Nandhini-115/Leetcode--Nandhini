// Last updated: 12/08/2026, 16:24:20
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int[] first = new int[26];
4
5        for (int i = 0; i < 26; i++) {
6            first[i] = -1;
7        }
8
9        int max = -1;
10
11        for (int i = 0; i < s.length(); i++) {
12            int index = s.charAt(i) - 'a';
13
14            if (first[index] == -1) {
15                first[index] = i;
16            } else {
17                max = Math.max(max, i - first[index] - 1);
18            }
19        }
20
21        return max;
22    }
23}