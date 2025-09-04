class Solution {
    public int sumOfUnique(int[] nums) {
       
       int n=nums.length;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++){
          mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }
       int sum=0;
       for(int i=0;i<n;i++){
              if (mp.get(nums[i]) == 1) {
                sum += nums[i];
            }
        }

        return sum;
       
    }
}