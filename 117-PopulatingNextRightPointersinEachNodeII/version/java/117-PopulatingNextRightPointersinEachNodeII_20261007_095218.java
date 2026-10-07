// Last updated: 07/10/2026, 09:52:18
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if (root == null) {
27            return null;
28        }
29        Node current = root;
30        while (current != null) {
31            Node dummy = new Node(0);
32            Node temp = dummy;
33            while (current != null) {
34                if (current.left != null) {
35                    temp.next = current.left;
36                    temp = temp.next;
37                }
38                if (current.right != null) {
39                    temp.next = current.right;
40                    temp = temp.next;
41                }
42                current = current.next;
43            }
44            current = dummy.next;
45        }
46        return root;
47    }
48}