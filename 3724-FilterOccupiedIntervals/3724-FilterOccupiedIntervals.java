// Last updated: 11/08/2026, 14:14:11
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution{
    public List<List<Integer>> filterOccupiedIntervals(int[][] oi, int fs, int fe) {
        Arrays.sort(oi,(a,b)->a[0]-b[0]);
        List<int[]>merge=new ArrayList<>();
        for(int[]x:oi){
            if(merge.isEmpty()||x[0]>merge.get(merge.size()-1)[1]+1)
                merge.add(new int[]{x[0],x[1]});
            else
            merge.get(merge.size()-1)[1]=Math.max(merge.get(merge.size()-1)[1],x[1]);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int[]x:merge){
            if(x[1]<fs||x[0]>fe)
                ans.add(Arrays.asList(x[0],x[1]));
            else{
                if(x[0]<fs)
                    ans.add(Arrays.asList(x[0],fs-1));
                if(x[1]>fe)
                    ans.add(Arrays.asList(fe+1,x[1]));
            }
        }
        return ans;
    }
}