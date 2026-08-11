// Last updated: 11/08/2026, 14:13:58
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,blank=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')
                y++;
            else if(ch=='D')
                y--;
            else if(ch=='L')
                x--;
            else if(ch=='R')
                x++;
            else
                blank++;
        }
        return Math.abs(x)+Math.abs(y)+blank;
    }
}