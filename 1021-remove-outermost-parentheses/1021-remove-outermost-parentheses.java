class Solution {
    public String removeOuterParentheses(String s) {
     
     String ans = "";
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    ans += c;
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ans += c;
                }
            }
        }

        return ans;
    }
};