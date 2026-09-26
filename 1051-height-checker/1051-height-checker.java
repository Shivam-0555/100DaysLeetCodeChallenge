class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int sorted[] = heights.clone();
        int cunt=0;
        Arrays.sort(sorted);
        for(int i =0;i<n;i++){
        if(heights[i] != sorted[i]){
            cunt++;
        }
        }
        return cunt;
    }
}