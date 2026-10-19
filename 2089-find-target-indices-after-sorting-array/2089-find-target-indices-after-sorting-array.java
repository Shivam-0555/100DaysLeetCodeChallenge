class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         int num = 0;     // count of elements less than target
        int tcount = 0;  // count of target elements

        for (int ele : nums) {
            if (ele == target) {
                tcount++;
            } else if (ele < target) {
                num++;
            }
        }

        java.util.List<Integer> ans = new java.util.ArrayList<>();

        while (tcount > 0) {
            ans.add(num);
            num++;
            tcount--;
        }

        return ans;
    }
}