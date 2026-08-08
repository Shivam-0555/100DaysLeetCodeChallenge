class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();
        for(int n : nums){
            numset.add(n);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=nums.length;i++){
            if(!numset.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}