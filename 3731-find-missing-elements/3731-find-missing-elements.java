class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return ans;
        }
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
            set.add(num);
        }
        for(int i = min+1;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
       return ans;

        
    }
}