class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int minele=nums[0];
       int maxdiff=-1;
       for(int j=1;j<n;j++){
        if(nums[j] > minele){
            maxdiff=Math.max(maxdiff,nums[j]-minele);
        }
        else{
            minele=nums[j];
        }
       }
       return maxdiff;
    }
}