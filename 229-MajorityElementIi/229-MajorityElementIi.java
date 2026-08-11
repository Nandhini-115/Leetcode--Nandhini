// Last updated: 11/08/2026, 14:19:47
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res= new ArrayList<>();
        int c1 = 0, c2 = 0;
        int candidate1=0, candidate2=1;
        for (int num : nums) {
            if (num == candidate1) {
                c1++;
            } else if (num == candidate2) {
                c2++;
            } else if (c1 == 0) {
                candidate1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                candidate2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                c1++;
            } else if (num == candidate2) {
                c2++;
            }
        }
        int n = nums.length;
        if (c1 > n / 3) {
            res.add(candidate1);
        }
        if (c2 > n / 3) {
            res.add(candidate2);
        }
        return res;
    }
}