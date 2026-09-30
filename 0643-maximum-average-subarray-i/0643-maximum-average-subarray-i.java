class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int n = nums.length;
        for(int i =0;i<k;i++){
          sum = sum + nums[i];
        }
        int maxsum = sum;
        for(int i =k;i<n;i++){
            sum -= nums[i-k];
            sum += nums[i];
            if(sum > maxsum) maxsum=sum;
        }
        return (double) maxsum /k;
    }
}