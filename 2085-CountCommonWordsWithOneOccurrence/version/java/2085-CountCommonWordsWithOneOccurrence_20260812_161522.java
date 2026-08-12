// Last updated: 12/08/2026, 16:15:22
1import java.util.HashMap;
2
3class Solution {
4    public int countWords(String[] words1, String[] words2) {
5        HashMap<String, Integer> map1 = new HashMap<>();
6        HashMap<String, Integer> map2 = new HashMap<>();
7
8        for (String word : words1) {
9            map1.put(word, map1.getOrDefault(word, 0) + 1);
10        }
11
12        for (String word : words2) {
13            map2.put(word, map2.getOrDefault(word, 0) + 1);
14        }
15
16        int count = 0;
17
18        for (String word : map1.keySet()) {
19            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
20                count++;
21            }
22        }
23
24        return count;
25    }
26}