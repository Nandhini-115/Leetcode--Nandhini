// Last updated: 11/08/2026, 14:14:24
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum=0;
        while (mainTank > 0) {
            mainTank--;
            sum+=10;
            if (sum%50==0 && additionalTank>0) {
                mainTank++;
                additionalTank--;
            }
        }
        return sum;
    }
}