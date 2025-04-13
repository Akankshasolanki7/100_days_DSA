class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        Set<Integer> exist=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(!exist.add(nums[i])){
                return i/3+1;
            }
        }
        return 0;
    }
}
