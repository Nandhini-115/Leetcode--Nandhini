// Last updated: 07/10/2026, 10:02:09
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, 1);
5        int sum = 0;
6        int count = 0;
7        for (int num : nums) {
8            sum += num;
9            if (map.containsKey(sum - k)) {
10                count += map.get(sum - k);
11            }
12            map.put(sum, map.getOrDefault(sum, 0) + 1);
13        }
14        return count;
15    }
16}