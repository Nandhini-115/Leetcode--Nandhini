// Last updated: 11/08/2026, 14:14:19
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }
        int ans = sum;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == ans) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return ans;
            }
            ans++;
        }
    }
}