class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toUpperCase(word.charAt(i)) == word.charAt(i)) {
                capital++;
            }
        }
        if (capital == word.length()) {
            return true;
        }

        if (capital == 0) {
            return true;
        }
        return capital == 1 &&
               Character.toUpperCase(word.charAt(0)) == word.charAt(0);
    }
}