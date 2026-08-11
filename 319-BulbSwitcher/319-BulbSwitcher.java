// Last updated: 11/08/2026, 14:19:14
class Solution {
    public int bulbSwitch(int n) {
        int c=0;
        int i = 1;
        while (i * i <= n) {
            c++;
            i++;
        }
         return c;
    }
}
   