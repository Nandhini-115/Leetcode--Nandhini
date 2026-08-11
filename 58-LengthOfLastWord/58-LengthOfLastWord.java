// Last updated: 11/08/2026, 14:22:16
class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        int n=word.length;
        return word[n-1].length();
    }
}