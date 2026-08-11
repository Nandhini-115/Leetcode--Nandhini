// Last updated: 11/08/2026, 14:16:27
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        int ans[] = new int[queries.length];
        HashSet<String> on = new HashSet<>();
        HashMap<Integer,Integer> row = new HashMap<>();
        HashMap<Integer,Integer> col = new HashMap<>();
        HashMap<Integer,Integer> d1 = new HashMap<>();
        HashMap<Integer,Integer> d2 = new HashMap<>();
        for(int[] lamp : lamps){
            int r = lamp[0];
            int c = lamp[1];
            String key = r + "," + c;
            if(on.contains(key))
                continue;
            on.add(key);
            row.put(r, row.getOrDefault(r,0)+1);
            col.put(c, col.getOrDefault(c,0)+1);
            d1.put(r-c, d1.getOrDefault(r-c,0)+1);
            d2.put(r+c, d2.getOrDefault(r+c,0)+1);
        }
        for(int i=0;i<queries.length;i++){
            int r = queries[i][0];
            int c = queries[i][1];
            if(row.getOrDefault(r,0)>0 ||
               col.getOrDefault(c,0)>0 ||
               d1.getOrDefault(r-c,0)>0 ||
               d2.getOrDefault(r+c,0)>0){
                ans[i] = 1;
            }
            for(int x=r-1;x<=r+1;x++){
                for(int y=c-1;y<=c+1;y++){
                    String key = x + "," + y;
                    if(on.contains(key)){
                        on.remove(key);
                        row.put(x, row.get(x)-1);
                        col.put(y, col.get(y)-1);
                        d1.put(x-y, d1.get(x-y)-1);
                        d2.put(x+y, d2.get(x+y)-1);
                    }
                }
            }
        }
        return ans;
    }
}