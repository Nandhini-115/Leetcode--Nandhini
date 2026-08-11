// Last updated: 11/08/2026, 14:19:03
class Solution {
    public void reverseString(char[] s) {
        int s1=0,e=s.length-1;
        char temp;
        while(s1<e)
        {
        temp=s[s1];
        s[s1]=s[e];
        s[e]=temp;
        s1++;
        e--;
        }
        for(char x:s)
        System.out.print(x+" ");

        
    }
}