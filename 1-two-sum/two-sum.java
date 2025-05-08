class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //    int arr[] =new int[2];
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(target-nums[i])){
    //             arr[0]=map.get(target-nums[i]);
    //             arr[1]=i;
    //         }
    //         else{
    //             map.put(nums[i],i);
    //         }
    //     }
    //     return arr;


    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int comp=target-nums[i];
        if(mp.containsKey(comp)){
            return new int[] {mp.get(comp),i};
        } 
        mp.put(nums[i],i);
    }
    return new int[] {};
    }
}
