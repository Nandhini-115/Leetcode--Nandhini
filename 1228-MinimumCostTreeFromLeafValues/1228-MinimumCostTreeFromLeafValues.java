// Last updated: 11/08/2026, 14:16:10
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int ans = 0;
        while (arr.length > 1) {
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex == 0) {
                ans += arr[minIndex] * arr[minIndex + 1];
            } 
            else if (minIndex == arr.length - 1) {
                ans += arr[minIndex] * arr[minIndex - 1];
            } 
            else {
                ans += arr[minIndex] * Math.min(arr[minIndex - 1], arr[minIndex + 1]);
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != minIndex) {
                    newArr[j++] = arr[i];
                }
            }
            arr = newArr;
        }
        return ans;
    }
}