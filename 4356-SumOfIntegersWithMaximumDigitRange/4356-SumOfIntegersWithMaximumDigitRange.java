// Last updated: 11/08/2026, 14:13:38
class Solution {
    public int maxDigitRange(int[] nums) {
        int r=-1;
        int sum=0;
        for(int num:nums){
            int temp=num;
            int max=0;
            int min=9;
            if(temp==0){
                min=0;
                max=0;
            }
            while(temp>0){
                int d=temp%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                temp/=10;
            }
            int range=max-min;
            r=Math.max(r,range);
        }
         for(int num:nums){
            int temp=num;
            int max=0;
            int min=9;
            if(temp==0){
                min=0;
                max=0;
            }
            while(temp>0){
                int d=temp%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                temp/=10;
            }
        if(max-min==r){
            sum+=num;
        }
        }
        return sum;
    }
}