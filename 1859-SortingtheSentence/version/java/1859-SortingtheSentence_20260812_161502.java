// Last updated: 12/08/2026, 16:15:02
1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] result = new String[words.length];
5
6        for (String word : words) {
7            int pos = word.charAt(word.length() - 1) - '1';
8            result[pos] = word.substring(0, word.length() - 1);
9        }
10
11        return String.join(" ", result);
12    }
13}