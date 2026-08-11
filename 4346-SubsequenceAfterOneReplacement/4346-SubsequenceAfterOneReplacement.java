// Last updated: 11/08/2026, 14:13:57
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n>m)
            return false;
        int[] l=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            while(c<m && t.charAt(c)!=s.charAt(i)) c++;
            l[i]=(c<m)?c:m;
            c++;
        }
        int [] r=new int[n];
        c=m-1;
        for(int i=n-1;i>=0;i--){
            while(c>=0 && t.charAt(c)!= s.charAt(i)) c--;
            r[i]=(c>=0)?c:-1;
            c--;
        }
        if(l[n-1]<m)
            return true;
        for(int i=0; i<n;i++){
            int pe=(i==0)?-1:l[i-1];
            int ns=(i==n-1)? m:r[i+1];
            if(pe<ns-1){
                return true;
            }
        }
        return false;
    }
}