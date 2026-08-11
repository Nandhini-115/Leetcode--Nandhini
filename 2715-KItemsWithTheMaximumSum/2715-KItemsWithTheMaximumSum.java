// Last updated: 11/08/2026, 14:14:35
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         int sum = 0;
        if (k <= numOnes) {
            sum += k;
            return sum;
        } else {
            sum += numOnes;
            k -= numOnes;
        }
        if (k <= numZeros) {
            return sum; 
        } else {
            k -= numZeros;
        }
        sum -= k;
        return sum;
    }
}