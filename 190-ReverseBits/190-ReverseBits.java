// Last updated: 11/08/2026, 14:20:31
class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev * 2 + (n % 2);
            n = n / 2;
        }
        return rev;
    }
}
