class Solution {
    public String convertToTitle(int c) {
        StringBuilder title = new StringBuilder();
        while(c > 0){
            c--;
            int r =c %26;
            title.append((char)(r +'A'));
            c = c / 26;
        }
        return title.reverse().toString();
    }
}