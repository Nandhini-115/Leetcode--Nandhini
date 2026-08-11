// Last updated: 11/08/2026, 14:14:27
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int sum=0;
        if(num>t || num==t || num<t)
        sum+=(num+t)+t;
        return sum;
        


    }
}