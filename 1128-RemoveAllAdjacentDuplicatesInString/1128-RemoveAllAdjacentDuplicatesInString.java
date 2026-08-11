// Last updated: 11/08/2026, 14:16:22
import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!st.isEmpty() && st.peek() == current) {
                st.pop(); 
            } 
            
            else {
                st.push(current);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}