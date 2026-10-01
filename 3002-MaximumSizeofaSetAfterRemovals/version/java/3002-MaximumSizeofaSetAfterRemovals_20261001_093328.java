// Last updated: 01/10/2026, 09:33:28
1import java.util.*;
2class Solution {
3    public int maximumSetSize(int[] nums1, int[] nums2) {
4        int n = nums1.length;
5        Set<Integer> set1 = new HashSet<>();
6        Set<Integer> set2 = new HashSet<>();
7        for (int x : nums1) {
8            set1.add(x);
9        }
10        for (int x : nums2) {
11            set2.add(x);
12        }
13        int unique1 = set1.size();
14        int unique2 = set2.size();
15        int common = 0;
16        for (int x : set1) {
17            if (set2.contains(x)) {
18                common++;
19            }
20        }
21        int only1 = unique1 - common;
22        int only2 = unique2 - common;
23        int take1 = Math.min(only1, n / 2);
24        int take2 = Math.min(only2, n / 2);
25        int remaining = n - take1 - take2;
26        int commonTake = Math.min(common, remaining);
27        return take1 + take2 + commonTake;
28    }
29}