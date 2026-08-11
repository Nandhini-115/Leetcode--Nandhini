// Last updated: 11/08/2026, 14:19:33
class Solution {
    public int addDigits(int num) {
        int sum;
        int n=num;
        while(n>9)
        {
            sum=0;
         while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
            n/=10;
        }
        n=sum;
        }
        return n;
    }
}