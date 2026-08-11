// Last updated: 11/08/2026, 14:14:12
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int d = 0;
        int a = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int diagonal = l* l+ w *w;
            int area = l*w;
            if (diagonal >d) {
                d=diagonal;
                a=area;
            } 
            else if (diagonal==d) {
                a= Math.max(a, area);
            }
        }
        return a;
    }
}