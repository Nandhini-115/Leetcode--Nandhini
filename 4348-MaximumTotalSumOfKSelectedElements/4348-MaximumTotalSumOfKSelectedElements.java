// Last updated: 11/08/2026, 14:13:55
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            int val=nums[n-1-i];
            long currentMul=Math.max(1L,(long)mul-i);
            ans+=val*currentMul;
        }
        return ans;
    }
}