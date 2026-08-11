// Last updated: 11/08/2026, 14:22:04
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        int left = 1;
        int right = x;
        int ans = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(mid <= x / mid) {
                ans = mid;       
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}