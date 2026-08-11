// Last updated: 11/08/2026, 14:14:16
class Solution {
    public int maxFrequencyElements(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      int max=0;
      for(int count:map.values()){
        max=Math.max(max,count);
      }
      int ans=0;
      for(int count:map.values()){
        if(count==max)
        ans+=count;
      }
      return ans;
    }
}