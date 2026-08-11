// Last updated: 11/08/2026, 14:15:11
class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
        if(n%i==0)
        c++;
        }
        if(c==3)
        return true;
        else
        return false;
    }
}