// Last updated: 11/08/2026, 14:15:31
class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        int n=nums.length;
        for(i=1;i<n;i++)
        nums[i]=nums[i]+nums[i-1];
        return nums;
    }
}