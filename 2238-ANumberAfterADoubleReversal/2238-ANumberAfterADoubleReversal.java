// Last updated: 11/08/2026, 14:15:03
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp,reversed1=0,reversed2=0;
        temp=num;
        while(num!=0)
        {
        int d=num%10;
        reversed1=reversed1*10+d;
        num/=10;
        }
        while(reversed1!=0)
        {
        int m=reversed1%10;
        reversed2=reversed2*10+m;
        reversed1/=10;
        }
        if(reversed2==temp)
        return true;
        else
        return false;
        
    }
}