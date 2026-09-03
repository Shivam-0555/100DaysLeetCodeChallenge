class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left =0;
        int right = arr.length-1;
        int sum =0;
        while(left < right){
            for(int i  =0;i<arr.length;i++){
                sum = arr[left ]+ arr[right];
                if(sum > target){
                right--;
            } else if(sum < target){
                left++;
            } else if(target == sum){
                return new int[]{left+1,right+1};
            }
        }
        }
        return new int[]{};
    }
}