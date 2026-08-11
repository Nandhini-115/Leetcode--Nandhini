// Last updated: 11/08/2026, 14:14:43
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (isVowel(first) && isVowel(last)) {
                c++;
            }
        }

        return c;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}