// Last updated: 11/08/2026, 14:15:27
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=0;
        while(numBottles>=numExchange)
        {
            sum+=numExchange;
            numBottles=numBottles-numExchange+1;
        }
        return sum+numBottles;
    
    }
}