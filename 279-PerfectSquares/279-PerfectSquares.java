// Last updated: 11/08/2026, 14:19:24
class Solution {
    public int numSquares(int n) {
        int c=0;
        int[] arr= new int[n + 1];
         for (int i = 1; i <= n; i++) {
            arr[i] = i; 
         for (int j = 1; j * j <= i; j++) {
                c=arr[i - j * j] + 1;
                if (c<arr[i]) {
                    arr[i] = c;
                }
            }
        }
        return arr[n];
    }
}