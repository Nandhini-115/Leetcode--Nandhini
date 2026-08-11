// Last updated: 11/08/2026, 14:19:29
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,i;
        int n=nums.length;
        for(i=0;i<n;i++)
        sum+=nums[i];
        int x=n*(n+1)/2;
        return x-sum;
    }
}