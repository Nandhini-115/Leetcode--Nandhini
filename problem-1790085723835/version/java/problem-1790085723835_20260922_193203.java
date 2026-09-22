// Last updated: 22/09/2026, 19:32:03
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        int n=intervals.length;
4        int[]s=new int[n];
5        int[] e=new int[n];
6        for(int i=0;i<n;i++){
7            s[i]=intervals[i][0];
8            e[i]=intervals[i][1];
9        }
10        Arrays.sort(s);
11        Arrays.sort(e);
12        long c=0;
13        int j=0;
14        for(int i=0;i<n;i++){
15            while(j<n&& e[j]<s[i]){
16                j++;
17            }
18            c+=i-j;
19        }
20        return c;
21    }
22}