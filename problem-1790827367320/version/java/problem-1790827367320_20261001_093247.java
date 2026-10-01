// Last updated: 01/10/2026, 09:32:47
1import java.util.*;
2class Solution {
3    public long maximumSubarraySum(int[] nums, int k) {
4        Map<Integer, Long> map = new HashMap<>();
5        long sum = 0;
6        long ans = Long.MIN_VALUE;
7        for (int num : nums) {
8            sum += num;
9            if (map.containsKey(num - k)) {
10                ans = Math.max(ans, sum - map.get(num - k));
11            }
12            if (map.containsKey(num + k)) {
13                ans = Math.max(ans, sum - map.get(num + k));
14            }
15            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), sum - num));
16        }
17        return ans == Long.MIN_VALUE ? 0 : ans;
18    }
19}