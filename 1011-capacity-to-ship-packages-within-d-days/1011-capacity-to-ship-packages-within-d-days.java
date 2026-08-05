class Solution {
    public boolean isPossible(int[] weights,int days,int wLimit){
        int day=1;
        int currLoad=0;
        for(int i:weights){
            if(i>wLimit) return false;
            if(currLoad+i<=wLimit) currLoad+=i;
            else{
                day++;
                currLoad=i;
            }
        }
        if(day>days) return false;
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left=1;
        int right=0;
        for(int i:weights) right+=i;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(weights,days,mid)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}