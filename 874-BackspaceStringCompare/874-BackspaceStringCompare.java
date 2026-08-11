// Last updated: 11/08/2026, 14:16:58
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> sd=new Stack<>();
        for(char c: s.toCharArray()){
            if(c!='#'){
            st.push(c);
            }else if(!st.isEmpty())
            st.pop();
        }
        for(char c: t.toCharArray()){
            if(c!='#')
            sd.push(c);
            else if(!sd.isEmpty())
            sd.pop();
        
        }
        return st.equals(sd);
    }
}