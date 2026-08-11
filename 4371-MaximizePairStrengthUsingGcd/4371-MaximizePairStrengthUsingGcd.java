// Last updated: 11/08/2026, 14:13:41
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long gcdValue=gcd(nums[i],nums[j]);
                long s=((long)nums[i]*nums[j])/(gcdValue*gcdValue);
                max=Math.max(max,s);
            }
        }
        return max;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}