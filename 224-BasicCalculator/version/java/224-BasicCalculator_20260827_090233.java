// Last updated: 27/08/2026, 09:02:33
1class Solution {
2    public int calculate(String s) {
3        int result = 0;
4        int number = 0;
5        int sign = 1;
6
7        java.util.Stack<Integer> stack = new java.util.Stack<>();
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11
12            if (Character.isDigit(ch)) {
13                number = number * 10 + (ch - '0');
14            } 
15            else if (ch == '+') {
16                result += sign * number;
17                number = 0;
18                sign = 1;
19            } 
20            else if (ch == '-') {
21                result += sign * number;
22                number = 0;
23                sign = -1;
24            } 
25            else if (ch == '(') {
26                stack.push(result);
27                stack.push(sign);
28
29                result = 0;
30                sign = 1;
31            } 
32            else if (ch == ')') {
33                result += sign * number;
34                number = 0;
35
36                result *= stack.pop();
37                result += stack.pop();
38            }
39        }
40
41        result += sign * number;
42
43        return result;
44    }
45}