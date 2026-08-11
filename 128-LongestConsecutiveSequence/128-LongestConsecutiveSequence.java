// Last updated: 11/08/2026, 14:21:29
import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        int l=0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current=num;
                int c=1;
                while (set.contains(current + 1)) {
                    current++;
                    c++;
                }
                l= Math.max(l,c);
            }
        }
        return l;
    }
}