// Last updated: 07/10/2026, 09:51:29
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int n = nums.length;
4        int third = Integer.MIN_VALUE;
5        java.util.Stack<Integer> stack = new java.util.Stack<>();
6        for (int i = n - 1; i >= 0; i--) {
7            if (nums[i] < third) {
8                return true;
9            }
10            while (!stack.isEmpty() && nums[i] > stack.peek()) {
11                third = stack.pop();
12            }
13            stack.push(nums[i]);
14        }
15        return false;
16    }
17}