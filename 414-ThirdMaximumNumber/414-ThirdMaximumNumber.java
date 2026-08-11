// Last updated: 11/08/2026, 14:18:37
class Solution {
    public int thirdMax(int[] nums) {
        Long f=null;
        Long s = null;
        Long t = null;
        for (int n : nums) {
            long num = n;
            if ((f!= null && num == f) ||
                (s != null && num == s) ||
                (t != null && num ==t)) {
                continue;
            }

            if (f==null || num >f) {
                t= s;
                s =f;
                f=num;
            } 
            else if (s== null || num>s) {
                t=s;
                s=num;
            } 
            else if (t== null || num > t) {
                t= num;
            }
        }

        if (t== null) {
            return f.intValue();
        }
        return t.intValue();
    }
}