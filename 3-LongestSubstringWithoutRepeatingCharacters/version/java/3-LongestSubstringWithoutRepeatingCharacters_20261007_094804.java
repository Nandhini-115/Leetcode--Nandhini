// Last updated: 07/10/2026, 09:48:04
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0;
4        int max = 0;
5        HashSet<Character> set = new HashSet<>();
6        for (int right = 0; right < s.length(); right++) {
7            while (set.contains(s.charAt(right))) {
8                set.remove(s.charAt(left));
9                left++;
10            }
11            set.add(s.charAt(right));
12            max = Math.max(max, right - left + 1);
13        }
14        return max;
15    }
16}