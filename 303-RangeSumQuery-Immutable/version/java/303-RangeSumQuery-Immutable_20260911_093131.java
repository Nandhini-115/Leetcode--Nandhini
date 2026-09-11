// Last updated: 11/09/2026, 09:31:31
1class NumArray {
2
3    int[] prefix;
4
5    public NumArray(int[] nums) {
6
7        prefix = new int[nums.length + 1];
8
9        for (int i = 0; i < nums.length; i++) {
10            prefix[i + 1] = prefix[i] + nums[i];
11        }
12    }
13
14    public int sumRange(int left, int right) {
15
16        return prefix[right + 1] - prefix[left];
17    }
18}