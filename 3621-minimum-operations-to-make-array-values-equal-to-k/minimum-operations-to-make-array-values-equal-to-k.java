class Solution {
    public int minOperations(int[] nums, int k) {
     HashMap<Integer,Integer> mp=new HashMap<>();
     for(int i:nums)
       if(i<k) return-1;
       else if(i>k)
       mp.put(i,mp.getOrDefault(1,0)+1);
       return mp.size();
    }
}