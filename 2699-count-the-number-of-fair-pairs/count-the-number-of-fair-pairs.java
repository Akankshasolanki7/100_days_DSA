class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        //Binary search trick
        int n=nums.length;
        Arrays.sort(nums);
        long result=0;
        for(int i=0;i<n;i++){
            int leftindex=lowerbound(nums,i+1,n,lower-nums[i]);
            int rightindex=upperbound(nums,i+1,n,upper-nums[i]);
            int x=leftindex-1-i;
            int y=rightindex-1-i;
            result+=(y-x);
        }
        return result;
    }
    public int lowerbound(int[] nums,int start,int end,int target){
        while(start<end){
            int mid = start + (end - start) / 2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid;
            }}
            return start;
        }
    
      public int upperbound(int[] nums,int start,int end,int target){
        while(start<end){
           int mid = start + (end - start) / 2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid;
            } 
        }
            return start;
        }
    

}