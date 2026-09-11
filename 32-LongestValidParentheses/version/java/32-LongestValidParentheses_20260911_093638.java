// Last updated: 11/09/2026, 09:36:38
1import java.util.*;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        stack.push(-1);
9
10        int max = 0;
11
12        for (int i = 0; i < s.length(); i++) {
13
14            if (s.charAt(i) == '(') {
15                stack.push(i);
16            }
17
18            else {
19                stack.pop();
20
21                if (stack.empty()) {
22                    stack.push(i);
23                }
24
25                else {
26                    max = Math.max(max, i - stack.peek());
27                }
28            }
29        }
30
31        return max;
32    }
33}