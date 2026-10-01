// Last updated: 01/10/2026, 09:34:33
1import java.util.*;
2class Solution {
3    public List<List<Integer>> findWinners(int[][] matches) {
4        Map<Integer, Integer> losses = new HashMap<>();
5        for (int[] match : matches) {
6            int winner = match[0];
7            int loser = match[1];
8            losses.putIfAbsent(winner, 0);
9            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
10        }
11        List<Integer> zeroLoss = new ArrayList<>();
12        List<Integer> oneLoss = new ArrayList<>();
13        for (int player : losses.keySet()) {
14            if (losses.get(player) == 0) {
15                zeroLoss.add(player);
16            } else if (losses.get(player) == 1) {
17                oneLoss.add(player);
18            }
19        }
20        Collections.sort(zeroLoss);
21        Collections.sort(oneLoss);
22        List<List<Integer>> result = new ArrayList<>();
23        result.add(zeroLoss);
24        result.add(oneLoss);
25        return result;
26    }
27}