// Last updated: 12/08/2026, 22:00:00
1import java.util.*;
2
3class Solution {
4    public int maximumNumberOfStringPairs(String[] words) {
5        Set<String> set = new HashSet<>();
6        int count = 0;
7
8        for (String word : words) {
9            String reverse = new StringBuilder(word).reverse().toString();
10
11            if (set.contains(reverse)) {
12                count++;
13            } else {
14                set.add(word);
15            }
16        }
17
18        return count;
19    }
20}