class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxdiff=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            maxdiff=Math.max(maxdiff,Math.abs(nums[i]-nums[(i+1) %n]));
        }
        return maxdiff;
    }
}