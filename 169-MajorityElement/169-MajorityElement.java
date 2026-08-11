// Last updated: 11/08/2026, 14:21:04
class Solution {
    public int majorityElement(int[] nums) {
        int c=0,t=0;
        for(int i=0;i<nums.length;i++)
        {
           if(c==0)
           t=nums[i];
           if(t==nums[i])
           c++;
           else
           c--;
        }
        return t;
    }
}