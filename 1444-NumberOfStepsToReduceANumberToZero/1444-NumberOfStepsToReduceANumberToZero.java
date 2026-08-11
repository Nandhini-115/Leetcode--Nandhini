// Last updated: 11/08/2026, 14:15:42
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
       while(num!=0)
       {
        if(num%2==0)
        {
        num/=2;
        c++;
        }
        else if(num%2!=0)
        {
        num-=1;
        c++;
        }

       }
       return c;
    }
}