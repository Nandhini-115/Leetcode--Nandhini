// Last updated: 27/08/2026, 09:02:25
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4
5        for (int i = 0; i < k; i++) {
6            sum += nums[i];
7        }
8
9        int maxSum = sum;
10
11        for (int i = k; i < nums.length; i++) {
12            sum += nums[i];
13            sum -= nums[i - k];
14
15            maxSum = Math.max(maxSum, sum);
16        }
17
18        return (double) maxSum / k;
19    }
20}