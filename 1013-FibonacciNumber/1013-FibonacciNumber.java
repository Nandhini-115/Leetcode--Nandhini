// Last updated: 11/08/2026, 14:16:35
class Solution {
    public int fib(int n) {
        int i;
        if(n==0||n==1){
        return n;
        }
        return fib(n-1)+fib(n-2);
        
        
    
    }
}