// Last updated: 11/08/2026, 14:18:07
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[] temp = score.clone();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            int rank = n - i;   
            for (int j = 0; j < n; j++) {
                if (score[j] == temp[i]) {
                    if (rank == 1)
                        ans[j] = "Gold Medal";
                    else if (rank == 2)
                        ans[j] = "Silver Medal";
                    else if (rank == 3)
                        ans[j] = "Bronze Medal";
                    else
                        ans[j] = String.valueOf(rank);
                }
            }
        }
        return ans;
    }
}