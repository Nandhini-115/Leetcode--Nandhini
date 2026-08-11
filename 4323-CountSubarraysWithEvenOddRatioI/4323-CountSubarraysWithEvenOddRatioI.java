// Last updated: 11/08/2026, 14:14:01
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int e=0;
            int o=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    e++;
                } else {
                    o++;
                }
                if(o>0 &&(long) e*b<=(long)o*a){
                    c++;
                }
            }
        }
        return c;
    }
}