// Last updated: 11/08/2026, 14:16:47
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count =new int[10000];
        for (int num : deck) {
            count[num]++;
        }
        int gcd = 0;
        for (int c : count) {
            if (c > 0) {
                gcd = findGCD(gcd, c);
            }
        }
        return gcd >= 2;
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}