// Last updated: 11/08/2026, 14:17:34
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = 0;
        int missing = 0;
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            }
            if (count[i] == 0) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}