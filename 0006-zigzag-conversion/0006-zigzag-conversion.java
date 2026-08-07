class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = true;
        for (char ch : s.toCharArray()) {
            rows[row].append(ch);
            if (row == numRows - 1)
                down = false;
            else if (row == 0)
                down = true;
            if (down)
                row++;
            else
                row--;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder str : rows) {
            ans.append(str);
        }
        return ans.toString();
    }
}