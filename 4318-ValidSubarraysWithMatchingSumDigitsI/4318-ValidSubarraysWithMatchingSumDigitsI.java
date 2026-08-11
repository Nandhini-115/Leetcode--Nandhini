// Last updated: 11/08/2026, 14:14:09
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                int lastDigit=(int)(sum%10);
                int firstDigit=0;
                long temp=sum;
                while(temp>=10){
                    temp/=10;
                }
                firstDigit=(int)temp;
                if(firstDigit==x&&lastDigit==x){
                    c++;
                }
            }
        }
        return c;
    }
}