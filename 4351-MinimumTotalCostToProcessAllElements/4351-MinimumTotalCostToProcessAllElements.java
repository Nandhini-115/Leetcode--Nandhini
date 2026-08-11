// Last updated: 11/08/2026, 14:13:54
class Solution {
    public int minimumCost(int[] nums, int k) {
        long o=0,res=k,MOD=1_000_000_007L;
        for(int num:nums){
            if(res<num){
                long need=(num-res+k-1)/k;
                o+=need;
                res+=need*k;
            }
            res-=num;
        }
        long n1=o,n2=o+1;
        if(n1%2==0) n1/=2; else n2/=2;
        return(int) (((n1%MOD) * (n2%MOD))%MOD);
    }
}