// Last updated: 07/10/2026, 09:48:47
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        for (String str : strs) {
5            char[] chars = str.toCharArray();
6            Arrays.sort(chars);
7            String key = new String(chars);
8            if (!map.containsKey(key)) {
9                map.put(key, new ArrayList<>());
10            }
11            map.get(key).add(str);
12        }
13
14        return new ArrayList<>(map.values());
15    }
16}