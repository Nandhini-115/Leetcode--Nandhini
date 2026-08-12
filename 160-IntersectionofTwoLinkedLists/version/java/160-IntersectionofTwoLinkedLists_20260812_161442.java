// Last updated: 12/08/2026, 16:14:42
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode a = headA;
15        ListNode b = headB;
16
17        while (a != b) {
18            if (a == null) {
19                a = headB;
20            } else {
21                a = a.next;
22            }
23
24            if (b == null) {
25                b = headA;
26            } else {
27                b = b.next;
28            }
29        }
30
31        return a;
32    }
33}