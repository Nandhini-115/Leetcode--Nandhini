// Last updated: 11/08/2026, 14:21:53
import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int i, c0=0,c1=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c0++;
        
        else if(nums[i]==1)
        c1++;
        }

        for(i=0;i<c0;i++)
        nums[i]=0;
        for(i=c0;i<(c1+c0);i++)
        nums[i]=1;
        for(i=(c1+c0);i<nums.length;i++)
        nums[i]=2;
        for(i=0;i<nums.length;i++)
        System.out.print(nums[i]+" ");


        
    }
}