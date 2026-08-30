class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int range = n * (n+1) / 2;
        int missing =0;
            for(int i =0;i<n;i++){
                missing += nums[i];
            }
        return range - missing;
    }
}