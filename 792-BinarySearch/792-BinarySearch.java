// Last updated: 11/08/2026, 14:17:06
class Solution {
    public int search(int[] nums, int target) {
        int i,high,flag,low;
        int n=nums.length;
		high=n-1;
		low=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
			return -1;
	}

}

  