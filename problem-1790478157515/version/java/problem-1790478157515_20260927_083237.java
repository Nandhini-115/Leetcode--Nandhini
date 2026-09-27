// Last updated: 27/09/2026, 08:32:37
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int n=nums.length;
4        int base=0;
5        java.util.HashMap<Integer,java.util.HashMap<Integer,Integer>>
6            map=new java.util.HashMap<>();
7        for(int i=0;i<n-1;i++){
8            int a=nums[i];
9            int b=nums[i+1];
10            if(a==b){
11                base++;
12            } else{
13                map.putIfAbsent(a,new java.util.HashMap<>());
14                map.get(a).put(b,map.get(a).getOrDefault(b,0)+1);
15                map.putIfAbsent(b,new java.util.HashMap<>());
16                map.get(b).put(a,map.get(b).getOrDefault(a,0)+1);
17            }
18        }
19        int ans=base;
20        for(int x:map.keySet()){
21            for(int y:map.get(x).keySet()){
22                ans=Math.max(ans,base+map.get(x).get(y));
23            }
24        }
25        return ans;
26    }
27}