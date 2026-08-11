// Last updated: 11/08/2026, 14:15:46
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1,res=0;
         while(n!=0){
            int d=n%10;
            pro=pro*d;
            n/=10;
            sum+=d;
            res=pro-sum;
         }
         return res;
}
}