class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum +=num;
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            int rs=totalsum-ls-nums[i];
            if(ls==rs)
                return i;
            ls+=nums[i];
        }
        return -1;
    }
}