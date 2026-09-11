// Last updated: 11/09/2026, 09:27:31
1import java.util.*;
2
3class Solution {
4    public String countOfAtoms(String formula) {
5        Stack<Map<String, Integer>> stack = new Stack<>();
6        stack.push(new TreeMap<>());
7
8        int i = 0;
9
10        while (i < formula.length()) {
11
12            if (formula.charAt(i) == '(') {
13                stack.push(new TreeMap<>());
14                i++;
15            }
16
17            else if (formula.charAt(i) == ')') {
18                Map<String, Integer> map = stack.pop();
19                i++;
20
21                int num = 0;
22
23                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
24                    num = num * 10 + (formula.charAt(i) - '0');
25                    i++;
26                }
27
28                if (num == 0)
29                    num = 1;
30
31                for (String atom : map.keySet()) {
32                    int count = map.get(atom) * num;
33
34                    stack.peek().put(atom,
35                        stack.peek().getOrDefault(atom, 0) + count);
36                }
37            }
38
39            else {
40                String atom = "" + formula.charAt(i);
41                i++;
42
43                while (i < formula.length() &&
44                       Character.isLowerCase(formula.charAt(i))) {
45                    atom += formula.charAt(i);
46                    i++;
47                }
48
49                int num = 0;
50
51                while (i < formula.length() &&
52                       Character.isDigit(formula.charAt(i))) {
53                    num = num * 10 + (formula.charAt(i) - '0');
54                    i++;
55                }
56
57                if (num == 0)
58                    num = 1;
59
60                stack.peek().put(atom,
61                    stack.peek().getOrDefault(atom, 0) + num);
62            }
63        }
64
65        StringBuilder result = new StringBuilder();
66
67        for (String atom : stack.peek().keySet()) {
68            result.append(atom);
69
70            int count = stack.peek().get(atom);
71
72            if (count > 1)
73                result.append(count);
74        }
75
76        return result.toString();
77    }
78}